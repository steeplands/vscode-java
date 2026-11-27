package oop.currencyconverter;

public class Currency {
    private String symbol;
    private double toEUR;

    public Currency(String symbol, double toEUR) {
        this.toEUR = Math.abs(toEUR);
        this.symbol = symbol.toUpperCase();
    }

    public String getSymbol() {
        return this.symbol;
    }

    public double getToEUR() {
        return this.toEUR;
    }

    public double convertToEUR(double ammount) {
        return ammount / this.toEUR;
    }

    public double convertFromEUR(double ammount) {
        return ammount * this.toEUR;
    }
}
