import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    private BigInteger[] r = new BigInteger[2];

    public Rational() {

        this.r[0] = new BigInteger("0");
        this.r[1] = new BigInteger("1");
    }

    public Rational(BigInteger numerator){
        this.r[0] = numerator;
        this.r[1] = new BigInteger("1");
    }

    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = numerator.gcd(denominator);
        this.r[0] = (denominator.compareTo(new BigInteger("0")) == 1 ?
                new BigInteger("1") : new BigInteger("-1")).multiply(numerator.divide(gcd));

        this.r[1] = denominator.abs().divide(gcd);

    }

    public BigInteger getNumerator() {
        return r[0];
    }

    public BigInteger getDenominator() {
        return r[1];
    }

    public Rational add(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator()).add(r[1].multiply(secondRational.getNumerator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator()).subtract(r[1]).multiply(secondRational.getNumerator());
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getNumerator());
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator());
        BigInteger d = r[1].multiply(secondRational.getNumerator());
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (r[1].equals(new BigInteger("1")) || r[0].equals("0"))
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object obj) {
        return this.subtract((Rational) obj).getNumerator().equals(new BigInteger("0"));

    }


    @Override // Implement the abstract intValue method in Number
    public int intValue() {
        return (int) doubleValue();
    }

    @Override // Implement the abstract floatValue method in Number
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override // Implement the doubleValue method in Number
    public double doubleValue() {
        return this.getNumerator().doubleValue() / this.getDenominator().doubleValue();
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
        return (long) doubleValue();
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational o) {
        return (this.subtract(o).getNumerator().doubleValue() > 0) ? 1 :
                ((this.subtract(o).getNumerator().doubleValue() < 0)) ? -1 : 0;


    }

}
