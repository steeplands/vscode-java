package oop.currencyconverter;

public class CurrencyConverter {
    private Currency[] currencies;
    private static int nextIndex;

    public CurrencyConverter(int maxCurrencies) {
        this.currencies = new Currency[maxCurrencies];
    }

    public boolean addCurrency(Currency currency) {
        return this.addCurrency(currency.getSymbol(), currency.getToEUR());
    }

    public boolean addCurrency(String symbol, double toEUR) {
        if (CurrencyConverter.nextIndex == this.currencies.length) return false;

        this.currencies[CurrencyConverter.nextIndex++] = new Currency(symbol, toEUR);
        return true;
    }

    public Currency getCurrencyFromSymbol(String symbol) {
        for (Currency currency : currencies) {
            if (currency != null && currency.getSymbol() == symbol.toUpperCase()) {
                return currency;
            }
        }
        return null;
    }

    public double convert(String fromSymbol, String toSymbol, double ammount) {
        Currency from = this.getCurrencyFromSymbol(fromSymbol);
        Currency to = this.getCurrencyFromSymbol(toSymbol);

        if (from == null || to == null) {
            return 0;
        }

        return this.convert(from, to, ammount);
    }

    public double convert(Currency from, Currency to, double ammount) {
        return to.convertFromEUR(from.convertToEUR(ammount));
    }

    public boolean isSymbolValid(String currencySymbol) {
        if (this.getCurrencyFromSymbol(currencySymbol) != null) return true;
        else return false;
    }

    public boolean isSymbolWrong(String currencySymbol) {
        return !isSymbolValid(currencySymbol);
    }
}
