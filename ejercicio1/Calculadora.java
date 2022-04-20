
package ejercicio1;

public class Calculadora {
   
    private double a;
    private double b;

    public Calculadora() {
    }

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    double suma() {
        double sum = this.a + this.b;
        return sum;
    }

    double resta() {
        double resta = this.a - this.b;
        return resta;
    }

    double multiplicacion() {
        double mult = this.a * this.b;
        return mult;
    }

    double divicion() {
        double divicion = this.a / this.b;
        return divicion;
    } 
}
