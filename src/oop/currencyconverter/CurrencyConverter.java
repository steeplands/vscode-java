package oop.currencyconverter;

public class CurrencyConverter {
    

    public static void main(String[] args) {
        Currency usd = new Currency("USD", 1.1);
        Currency jpy = new Currency("YPN", 174.8);
        //Currency gbp = new Currency("USD", 0.84);

        double ammount1usd = 255.5;

        double ammount1InJpy = jpy.convertFromEUR(usd.convertToEUR(ammount1usd));

        System.out.println(ammount1InJpy);
    }
}
