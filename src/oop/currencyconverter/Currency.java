package oop.currencyconverter;

public class Currency {
    private String symbol;
    private double toEUR;

    public Currency(String symbol, double toEUR) {
        this.toEUR = toEUR;
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public double convertToEUR(double ammount) {
        return this.toEUR * ammount;
    }

    public double convertFromEUR(double ammount) {
        return ammount/this.toEUR;
    }
}
