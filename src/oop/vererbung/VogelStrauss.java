package oop.vererbung;

public class VogelStrauss extends Vogel{
    public VogelStrauss(String name) {
        super("Vogelstrauß", name);
    }

    @Override
    public void fliegen() {
        System.out.printf("%s (%s) kann nicht fliegen.\n", this.name, this.art);
    }
}