import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ejercicio_13_4_DisplayCalendars {
    public static void main(String[] args) {

        //java Exercise13_04 5 2016
        if (args.length > 2) {
            System.out.println("For a specific month and year\nUsage: java Ejercicio_13_4_DisplayCalendars numberOfTheMonth numberOfTheYear");
            System.out.println("For a specific month int current year\nUsage: java Ejercicio_13_4_DisplayCalendars numberOfTheMonth");
            System.out.println("For a current month and yer\nUsage: java Ejercicio_13_4_DisplayCalendars");
            System.exit(1);
        }

        int year = 0;
        int month = 0;

        if (args.length == 2 && !isValidMonth(args[0])) {
            System.out.println("For a specific month and year\nUsage: java Ejercicio_13_4_DisplayCalendars numberOfTheMonth numberOfTheYear");
            System.out.println("numberOfTheMonth must be numeric and between 1 and 12");
            System.exit(2);
        }

        if (args.length == 2 && !isValidYear(args[1])) {
            System.out.println("For a specific month and year\nUsage: java Ejercicio_13_4_DisplayCalendars numberOfTheMonth numberOfTheYear");
            System.out.println("numberOfTheYear must be numeric");
            System.exit(3);
        }

        if (args.length == 2 && isValidMonth(args[0]) && isValidYear(args[1])) {
            month = Integer.parseInt(args[0]) - 1;
            year = Integer.parseInt(args[1]);
        }

        if (args.length == 1 && !isValidMonth(args[0])) {
            System.out.println("For a specific month in current year\nUsage: java Ejercicio_13_4_DisplayCalendars numberOfTheMonth");
            System.out.println("numberOfTheMonth must be numeric and between 1 and 12");
            System.exit(4);
        }

        if (args.length == 1 && isValidMonth(args[0])) {
            month = Integer.parseInt(args[0]) - 1;
            Calendar current = new GregorianCalendar();
            year = current.get(Calendar.YEAR);
        }

        if (args.length == 0) {
            Calendar current = new GregorianCalendar();
            month = current.get(Calendar.MONTH);
            year = current.get(Calendar.YEAR);

        }

        /*

        Scanner input = new Scanner(System.in);

        //Prompt the user to enter year
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        //Prompt user to enter month
        System.out.print("Enter month as a number between 1 an 12: ");
        int month = input.nextInt() - 1;

         */

        //Print calendar for the month of the year
        printMonth(year, month);

    }

    public static boolean isValidMonth(String str) {
        if (str == null) {
            return false;
        }
        try {
            int num = Integer.parseInt(str);
            if (num < 1 || num > 12)
                return false;

        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public static boolean isValidYear(String str) {
        if (str == null) {
            return false;
        }
        try {
            int num = Integer.parseInt(str);

        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public static void printMonth(int year, int month) {

        Calendar calendar = new GregorianCalendar(year, month, 1);

        //Print the body of the calendar
        printMonthTitle(calendar);

        //Print the body of the calendar
        printMonthBody(calendar);
    }

    public static void printMonthTitle(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);

        System.out.println("         " + getMonthName(month)
                + " " + year);
        System.out.println("_______________________________");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month) {
        return switch (month) {
            case 0 -> "January";
            case 1 -> "February";
            case 2 -> "March";
            case 3 -> "April";
            case 4 -> "May";
            case 5 -> "June";
            case 6 -> "July";
            case 7 -> "August";
            case 8 -> "September";
            case 9 -> "October";
            case 10 -> "November";
            case 11 -> "December";
            default -> "";
        };
    }

    public static void printMonthBody(Calendar calendar) {
        //Get start day of the week for the fists date in the month
        int startDay = getStartDay(calendar);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);

        //Get number of the days in month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        //Pad space before the first day of the month
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println(" ");
        }

        System.out.println(" ");
    }

    public static int getStartDay(Calendar calendar) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        //Get total number of gays from 1/1/1800 to month/year
        int totalNumberOfDays = getTotalNumberOfDays(calendar);

        //Return the star day for month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);

        int total = 0;

        //Get the total days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;

        //Add days from Jan to the month prior to the calendar month
        for (int i = 0; i < month; i++)
            total = total + getNumberOfDaysInMonth(year, i);

        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 0 || month == 2 || month == 4 || month == 6 ||
                month == 7 || month == 9 || month == 11)
            return 31;

        if (month == 3 || month == 5 || month == 8 || month == 10)
            return 30;

        if (month == 1) return isLeapYear(year) ? 29 : 28;

        return 0; //If month is incorrect
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }


}
