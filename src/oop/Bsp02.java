package oop;

import helper.SavitchIn;

public class Bsp02 {
    public static void main(String[] args) {
        Kreis kreis1 = new Kreis();
        kreis1.radius = 4;
        kreis1.printState();

        Kreis kreis2 = new Kreis(2);
        kreis2.printState();

        System.out.println();
        Vieleck viel1 = new Vieleck();

        System.out.print("Vertices: ");
        viel1.vertices = SavitchIn.readLineInt();
        System.out.print("Side: ");
        viel1.side = SavitchIn.readLineInt();

        viel1.printState();
    }
}
