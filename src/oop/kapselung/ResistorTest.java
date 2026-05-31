package oop.kapselung;

public class ResistorTest {
    public static void main(String[] args) {
        System.out.println("===== Paralell =====");
        Resistor r1 = new Resistor(300);
        Resistor r2 = new Resistor(300);

        Resistor parallel1 = Resistor.parallelConnection(r1, r2);
        System.out.println(parallel1.toString());

        r1.parallelConnection(r2);
        System.out.println(r1.toString());

        System.out.println("\n===== toString() =====");
        System.out.println("r1:         " + r1.toString());
        System.out.println("r2:         " + r2.toString());

        System.out.println("\n===== Series =====");

        Resistor series1 = Resistor.seriesConnection(r1, r2);
        System.out.println(series1.toString());

        r2.seriesConnection(r1);
        System.out.println(r2.toString());

        System.out.println("\n===== toString() =====");
        System.out.println("r1:         " + r1.toString());
        System.out.println("r2:         " + r2.toString());

        System.out.println("\n===== SI prefix =====");
        Resistor rk = new Resistor(5600);
        Resistor rM = new Resistor(8020000);
        Resistor rG = new Resistor(1000000000);

        System.out.println(rk.toString());
        System.out.println(rM.toString());
        System.out.println(rG.toString());
    }
}
