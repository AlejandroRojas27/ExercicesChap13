public class Listing_13_13_Rational extends Number implements Comparable<Listing_13_13_Rational> {
    // Data fields for numerator and denominator
    //private long numerator = 0;
    //private long denominator = 1;

    private long[] r = new long[2];

    /** Construct a rational with default properties */
    public Listing_13_13_Rational(){
        this(0,1);
    }

    /** Construct a rational with specified numerator and denominator */
    public Listing_13_13_Rational(long numerator, long denominator){
        long gcd = gcd(numerator, denominator);
        this.r[0] = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.r[1] = Math.abs(denominator) / gcd;
    }

    /** Find GCD of two numbers */
    private static long gcd(long n, long d){
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if(n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        return gcd;
    }

    /** Return numerator */
    public long getNumerator(){
        return r[0];
    }

    /** Return denominator */
    public long getDenominator() {
        return r[1];
    }

    /** Add a rational number to this rational */
    public Listing_13_13_Rational add(Listing_13_13_Rational secondRational){
        long n = r[0] * secondRational.getDenominator() +
                r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Listing_13_13_Rational(n, d);
    }

    /** Substract a rational number from this rational */
    public Listing_13_13_Rational subtract(Listing_13_13_Rational secondRational){
        long n = r[0] * secondRational.getDenominator()
                - r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Listing_13_13_Rational(n, d);
    }

    /** Multiply a rational number by this rational */
    public Listing_13_13_Rational multiply(Listing_13_13_Rational secondRational){
        long n = r[0] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new Listing_13_13_Rational(n, d);
    }

    /** Divide a rational number by this rational */
    public Listing_13_13_Rational divide(Listing_13_13_Rational secondRational){
        long n = r[0] * secondRational.getDenominator();
        long d = r[1] * secondRational.getNumerator();
        return new Listing_13_13_Rational(n, d);
    }

    @Override
    public String toString() {
        if (r[1] == 1 || r[0] == 0)
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object obj) {
        return (this.subtract((Listing_13_13_Rational) (obj))).getNumerator() == 0;
    }

    @Override // Implement the abstract intValue method in Number
    public int intValue() {
        return (int)doubleValue();
    }

    @Override // Implement the abstract floatValue method in Number
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override // Implement the doubleValue method in Number
    public double doubleValue() {
        return r[0] * 1.0 / r[1];
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
        return (long) doubleValue();
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(Listing_13_13_Rational o) {
        return (this.subtract(o).getNumerator() > 0) ? 1:
                ((this.subtract(o).getNumerator() < 0))? -1: 0;
    }
}
