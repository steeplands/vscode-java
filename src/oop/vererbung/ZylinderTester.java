package oop.vererbung;

public class ZylinderTester {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ZylinderKreis zKreis = new ZylinderKreis(4, 5);
        ZylinderQuadratisch zQuad = new ZylinderQuadratisch(10, 4);

        System.out.println("\nKreis:");
        System.out.println("Kreis: " + zKreis.getGrundflaeche());
        System.out.println("Kreis: " + zKreis.getMantel());
        System.out.println("Kreis: " + zKreis.getOberflaeche());
        System.out.println("Kreis: " + zKreis.getUmfangGrundflaeche());
        System.out.println("Kreis: " + zKreis.getVolumen());

        System.out.println("\nQuadratisch:");
        System.out.println("Kreis: " + zQuad.getGrundflaeche());
        System.out.println("Kreis: " + zQuad.getMantel());
        System.out.println("Kreis: " + zQuad.getOberflaeche());
        System.out.println("Kreis: " + zQuad.getUmfangGrundflaeche());
        System.out.println("Kreis: " + zQuad.getVolumen());
    }
}
