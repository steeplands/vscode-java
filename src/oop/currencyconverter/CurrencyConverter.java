package oop.currencyconverter;

public class CurrencyConverter {
    private Currency[] currencies;
    private static int nextIndex;

    public CurrencyConverter(int maxCurrencies) {
        this.currencies = new Currency[maxCurrencies];
    }

    public boolean addCurrency(String symbol, double toEUR) {
        if (CurrencyConverter.nextIndex == this.currencies.length) return false;

        toEUR = Math.abs(toEUR);
        symbol = symbol.toUpperCase();

        this.currencies[CurrencyConverter.nextIndex] = new Currency(symbol, toEUR);
        return true;
    }

    public double convert(Currency from, Currency to, double ammount) {
        return to.convertFromEUR(from.convertToEUR(ammount));
    }

    public boolean isCurrencyValid(String currencySymbol) {
        currencySymbol = currencySymbol.toUpperCase();

        for (Currency currency : currencies) {
            if (currency.getSymbol() == currencySymbol) return true;
        }

        return false;
    }

    public boolean isCurrencyWrong(String currencySymbol) {
        return !isCurrencyValid(currencySymbol);
    }
}
