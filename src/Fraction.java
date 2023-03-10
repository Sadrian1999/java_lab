public class Fraction {
    private int numerator;
    private int denumerator;

    public Fraction() {
        this.numerator = 0;
        this.denumerator = 1;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denumerator = 1;
    }

    public Fraction(int numerator, int denumerator) throws ArithmeticException{
        this.numerator = numerator;
        if (denumerator == 0) { throw new ArithmeticException("Nem lehet 0-val osztani!"); }
        else { this.denumerator = denumerator; }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenumerator() {
        return denumerator;
    }

    public double doubleValue(){
        return numerator / denumerator;
    }

    public Fraction reciprocal(){
        return new Fraction(denumerator, numerator);
    }
    
    public Fraction add(Fraction fraction){
        return new Fraction(this.numerator * fraction.denumerator + fraction.numerator * this.denumerator,this.denumerator * fraction.denumerator);
    }

    public Fraction subtract(Fraction fraction){
        return new Fraction(this.numerator * fraction.denumerator - fraction.numerator * this.denumerator,this.denumerator * fraction.denumerator);
    }

    public Fraction multiply(Fraction fraction){
        return new Fraction(this.numerator * fraction.numerator, this.denumerator * fraction.denumerator);
    }

    public Fraction divide(Fraction fraction){
        return this.multiply(fraction.reciprocal());
    }

    private int highestCommonFactor(){
        int a, b;
        if (denumerator > numerator) {
            a = denumerator;
            b = numerator;
        }
        else {
            a = numerator;
            b = denumerator;
        }
        while (true) {
            int remainder = a % b;
            if (remainder == 0) {
                return b;
            }
            a = b;
            b = remainder;
            
        }
    }
    
    public Fraction simplify(){
        return new Fraction(numerator / highestCommonFactor(), denumerator / highestCommonFactor());
    }

    public boolean greaterThan(Fraction fraction){
        fraction.numerator *= this.denumerator;
        this.numerator *= fraction.denumerator;
        return (this.numerator > fraction.numerator) ? true: false;
    }

    public boolean lessThan(Fraction fraction){
        return (this.numerator < fraction.numerator) ? true: false;
    }

    public int compareTo(Fraction fraction){
        if (greaterThan(fraction)) {
            return 1;
        } 
        else if (lessThan(fraction)){
            return -1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Fraction a = new Fraction(1, 12);
        Fraction b = new Fraction(1, 12);
        //Fraction c = a.multiply(b).simplify();
        System.out.println(a.numerator + "\n" + a.denumerator);
        System.out.println(b.numerator + "\n" + b.denumerator);
        System.out.println(a.compareTo(b));
    }
}
