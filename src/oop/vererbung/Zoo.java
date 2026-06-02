package oop.vererbung;

public class Zoo {  // Tier Tester
    public static void main(String[] args) {
        Tier tiger = new Tier("Tiger", "Felix");
        tiger.beschreibung();

        Vierbeiner baer = new Vierbeiner("Bär", "Tobi");
        baer.beschreibung();
        baer.rennen();

        Tier nashorn = new Vierbeiner("Nashorn", "Kaa");
        nashorn.beschreibung();
        // nashorn.rennen();

        Hund hund = new Hund("Bello");
        hund.beschreibung();
        hund.rennen();

        Katze katze = new Katze("Blue");
        katze.beschreibung();
        katze.rennen();

        Vierbeiner katze2 = new Katze("GReeN");
        katze2.beschreibung();
        katze2.rennen();

        Vierbeiner katze3 = new Katze("Garfield");
        katze3.beschreibung();
        katze3.rennen();
    }
}
