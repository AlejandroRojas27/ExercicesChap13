public class Complex implements Cloneable, Comparable<Complex> {
    private double realPart; // a
    private double imaginaryPart; // bi

    public Complex() {
        this(0, 0);
    }

    public Complex(double realPart){
        this.realPart = realPart;
        this.imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public Complex add(Complex secondComplex) { // a + bi + c + di = (a + c) + (b + d)i
        return new Complex((this.realPart + secondComplex.getRealPart()),
                (this.imaginaryPart + secondComplex.imaginaryPart));
    }

    public Complex subtract(Complex secondComplex) { // a + bi - (c + di) = (a - c) + (b - d)i
        return new Complex((this.realPart - secondComplex.getRealPart()),
                (imaginaryPart - secondComplex.getImaginaryPart()));
    }

    public Complex multiply(Complex secondComplex) { // (a + bi) * (c + di) = (ac - bd) + (bc + ad)i
        return new Complex(
                ((this.realPart * secondComplex.getRealPart()) - (this.imaginaryPart * secondComplex.getImaginaryPart())),
                ((this.imaginaryPart * secondComplex.getRealPart()) + (this.realPart * secondComplex.getImaginaryPart())));
    }

    public Complex divide(Complex secondComplex) { // (a + bi)/(c + di) = (ac + bd)/(c2 + d2 ) + (bc - ad)i/(c2 + d2 )
        return new Complex(((((this.realPart * secondComplex.getRealPart()) + (this.imaginaryPart * secondComplex.getImaginaryPart()))
                / (Math.pow(secondComplex.getRealPart(), 2) + Math.pow(secondComplex.getImaginaryPart(), 2)))),
                (((this.imaginaryPart * secondComplex.getRealPart()) - (this.realPart * secondComplex.getImaginaryPart()))
                        / (Math.pow(secondComplex.getRealPart(), 2) + Math.pow(secondComplex.getImaginaryPart(), 2))));
    }

    public double abs(){
        return Math.sqrt(Math.pow(realPart, 2) + Math.pow(imaginaryPart, 2));
    }

    @Override
    public String toString() {
        return "(" + this.realPart + " + " + this.imaginaryPart + "i)";
    }

    @Override
    public Object clone()  {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
            //throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(Complex o) {
        return Double.compare(abs(), o.abs());
    }
}
