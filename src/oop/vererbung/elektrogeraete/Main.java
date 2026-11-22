package oop.vererbung.elektrogeraete;

public class Main {
    public static ILaden laden(ILaden device, int prozent) {
        device.aufladen(prozent);
        return device;
    }

    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Simsung", "S25", 750, false, 500);
        Notebook noteb = new Notebook("HP", "xBook", 1500, false, 2000);

        phone.einschalten();
        noteb.einschalten();

        System.out.println("Phone:      " + phone.getBeschreibung());
        System.out.println("Notebook:   " + noteb.getBeschreibung());

        phone.aufladen(10);
        noteb.aufladen(10);

        System.out.println("Phone:      " + phone.getBeschreibung());
        System.out.println("Notebook:   " + noteb.getBeschreibung());

        phone.speichern("null");
        noteb.speichern("null");

        System.out.println("Phone:      " + phone.getBeschreibung());
        System.out.println("Notebook:   " + noteb.getBeschreibung());

        // phone = laden(phone, 10);
        // noteb = laden(noteb, 10);
    }
}
