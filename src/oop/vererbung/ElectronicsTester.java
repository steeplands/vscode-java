package oop.vererbung;

public class ElectronicsTester {
    public static void main(String[] args) {
        ElectronicDevice baseDevice = new ElectronicDevice("Basisgeraet");
        
        Radio radio = new Radio("Radio HTL");
        Wecker wecker = new Wecker("Schulbeginn", 7, 45);

        ElectronicDevice[] devices = new ElectronicDevice[3];

        devices[0] = baseDevice;
        devices[1] = radio;
        devices[2] = wecker;

        for (ElectronicDevice device : devices) {
            System.out.println(device);
        }

        System.out.println("-".repeat(40));

        for (int i = 0; i < 5; i++) {
            radio.volumeUp();
        }

        for (ElectronicDevice device : devices) {
            System.out.println(device);
        }

        System.out.println("-".repeat(40));

        for (ElectronicDevice device : devices) {
            device.on();
            System.out.println(device);
        }
    }
}
