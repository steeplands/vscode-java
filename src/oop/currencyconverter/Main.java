package oop.currencyconverter;

import helper.SavitchIn;

public class Main {
    public static void main(String[] args) {
        Currency usd = new Currency("USD", 1.1);
        Currency jpy = new Currency("JPY", 174.8);

        Currency[] currencies = new Currency[10];
        currencies[0] = new Currency("EUR", 1);
        currencies[1] = new Currency("USD", 1.1);
        currencies[2] = new Currency("JPY", 174.8);
        currencies[3] = new Currency("GBP", 0.84);

        CurrencyConverter cc = new CurrencyConverter(10);

        System.out.println("=== Currency Converter ===");
        System.out.println("Supported currencies: EUR/USD/JPY/GBP");

        String userFrom;
        String userTo;

        do {
            System.out.print("Convert FROM: ");
            userFrom = SavitchIn.readLine();
            System.out.print("TO: ");
            userTo = SavitchIn.readLine();
        } while (cc.isCurrencyWrong(userTo) && cc.isCurrencyWrong(userFrom));

        System.out.println();


        double ammount1usd = 255.5;

        //double ammount1InJpy = jpy.convertFromEUR(usd.convertToEUR(ammount1usd));

        double ammount1InJpy = cc.convert(usd, jpy, ammount1usd);

        System.out.println(ammount1InJpy);
    }
}
