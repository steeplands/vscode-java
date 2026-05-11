package oop.kapselung;

public class ComplexNumber {

    private double imaginary;
    private double real;

    public ComplexNumber() {
        this.imaginary = 0;
        this.real = 0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public ComplexNumber(ComplexNumber other) {
        this.imaginary = other.getImaginary();
        this.real = other.getReal();
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public double getAbsoluteValue() {
        return Math.sqrt(this.imaginary * this.imaginary + this.real * this.real);
    }

    public double getArgument() {
        return Math.atan2(this.imaginary, this.real);
    }

    public void setCartesianCoordinates(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setPolarCoordinates(double absoluteValue, double argument) {
        this.real = absoluteValue * Math.cos(argument);
        this.imaginary = absoluteValue * Math.sin(argument);
    }

    public void add(ComplexNumber summand) {
        this.imaginary = this.getImaginary() + summand.getImaginary();
        this.real = this.getReal() + summand.getReal();
    }

    public void subtract(ComplexNumber subtrahend) {
        this.imaginary = this.getImaginary() - subtrahend.getImaginary();
        this.real = this.getReal() - subtrahend.getReal();
    }

    public void multiply(ComplexNumber factor) {
        double newReal = this.getReal() * factor.getReal() - this.getImaginary() * factor.getImaginary();
        this.imaginary = this.getReal() * factor.getImaginary() + this.getImaginary() * factor.getReal();   
        this.real = newReal;
    }

    public void divide(ComplexNumber divisor) {
        double a = this.real;
        double b = this.imaginary;
        double c = divisor.real;
        double d = divisor.imaginary;

        this.real = (a*c + b*d) / (c*c + d*d);
        this.imaginary = (b*c - a*d) / (c*c + d*d);
    }

    public void conjugate() {
        this.imaginary = this.getImaginary() * ( - 1);
    }

    public static ComplexNumber add(ComplexNumber summand1, ComplexNumber summand2) {
        ComplexNumber result = new ComplexNumber(summand1);
        result.add(summand2);
        return result;
    }

    public static ComplexNumber subtract(ComplexNumber minuend, ComplexNumber subtrahend) {
        ComplexNumber result = new ComplexNumber(minuend);
        result.subtract(subtrahend);
        return result;
    }

    public static ComplexNumber multiply(ComplexNumber factor1, ComplexNumber factor2) {
        ComplexNumber result = new ComplexNumber(factor1);
        result.multiply(factor2);
        return result;
    }

    public static ComplexNumber divide(ComplexNumber dividend, ComplexNumber divisor) {
        ComplexNumber result = new ComplexNumber(dividend);
        result.divide(divisor);
        return result;
    }

    public static ComplexNumber conjugate(ComplexNumber complexNumber) {
        ComplexNumber result = new ComplexNumber(complexNumber);
        result.conjugate();
        return result;
    }

    public void getNeatInfo() {
        System.out.printf("Z = %f + j %f = %f < %f\n", this.getReal(), this.getImaginary(), this.getAbsoluteValue(), this.getArgument());
    }
}
