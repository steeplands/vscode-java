package oop;

public class KreisTester {
    public static void main(String[] args) {
        Kreis kreis1 = new Kreis();
        kreis1.radius = 4;
        kreis1.printState();

        Kreis kreis2 = new Kreis(2);
        kreis2.printState();
    }
}
