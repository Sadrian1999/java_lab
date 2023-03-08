package complex;

public class Complex {
    private double realNumber;
    private double imaginaryNumber;

    public Complex(double realNumber, double imaginaryNumber){
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }
    
    public Complex(double realNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = 0;
    }
    
    public void setRealNumber(double realNumber){
        this.realNumber = realNumber;
    }

    public void setImaginaryNumber(double imaginaryNumber) {
        this.imaginaryNumber = imaginaryNumber;
    }

    public double getRealNumber(){
        return this.realNumber;
    }

    public double getImaginaryNumber(){
        return this.imaginaryNumber;
    }
    
    public Complex add(Complex number){
        return new Complex(this.realNumber + number.realNumber, this.imaginaryNumber + number.imaginaryNumber);
    }

    public Complex mult(Complex number){
        double newR = this.realNumber * number.realNumber - this.imaginaryNumber * number.imaginaryNumber;
        double newI = this.realNumber * number.imaginaryNumber + this.imaginaryNumber * number.realNumber;
        return new Complex(newR, newI);
    }

    public String toString(){
        return (this.imaginaryNumber > 0) ? this.realNumber + "+" + this.imaginaryNumber + "i" : this.realNumber + "" + this.imaginaryNumber + "i";
    }
}
