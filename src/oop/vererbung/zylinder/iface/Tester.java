package oop.vererbung.zylinder.iface;

public class Tester {
    public static void main(String[] args) {
        KreisIF kreis = new KreisIF(5);
        ZylinderAllgemeinIF zyl1 = new ZylinderAllgemeinIF(kreis, 5);

        System.out.println("Kreiszyl");
        System.out.println("AG:     " + zyl1.getGrundflaeche().getFlaeche());
        System.out.println("UG:     " + zyl1.getGrundflaeche().getUmfang());
        System.out.println("Mantel: " + zyl1.getMantel());

        RechteckIF recht = new RechteckIF(2, 3);
        ZylinderAllgemeinIF zyl2 = new ZylinderAllgemeinIF(recht, 5);

        System.out.println("Rechtzyl");
        System.out.println("AG:     " + zyl2.getGrundflaeche().getFlaeche());
        System.out.println("UG:     " + zyl2.getGrundflaeche().getUmfang());
        System.out.println("Mantel: " + zyl2.getMantel());
    }
}
