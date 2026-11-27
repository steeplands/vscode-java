package oop.currencyconverter;

import helper.SavitchIn;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter(10);

        Currency eur = new Currency("EUR", 1);
        Currency jpy = new Currency("JPY", 174.8);

        cc.addCurrency(eur);
        cc.addCurrency(jpy);
        cc.addCurrency(new Currency("GBP",0.84));
        cc.addCurrency("USD", 1.1);

        System.out.println("=== Currency Converter ===");
        System.out.println("Supported currencies: EUR/USD/JPY/GBP");

        Currency from;
        Currency to;
        double ammount;

        while (true) {
            System.out.print("Convert FROM: ");
            from = cc.getCurrencyFromSymbol(SavitchIn.readLine());
            System.out.print("TO: ");
            to = cc.getCurrencyFromSymbol(SavitchIn.readLine());

            if (to != null && from != null) break;
        }

        System.out.println("Ammount: ");
        ammount = SavitchIn.readLineDouble();

        double result = cc.convert(from, to, ammount);

        System.out.printf("%f %s --> %f %d", ammount, from.getSymbol(), result, to.getSymbol());
    }
}