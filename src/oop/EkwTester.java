package oop;

public class EkwTester {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Apfel", 1);
        Produkt p2 = new Produkt("Leberkassemmal", 3.5);
        Produkt p3 = new Produkt("Melone", 88.96);

        Einkaufswagen ekw = new Einkaufswagen(5);

        ekw.addPrd(p2);
        ekw.addPrd(p1);
        ekw.addPrd(p3);

        ekw.checkout();
    }
}
