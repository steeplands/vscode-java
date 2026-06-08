package oop.vererbung;

public class Adler extends Vogel{
    public Adler(String name) {
        super("Adler", name);
    }

    @Override
    public void fliegen() {
        System.out.printf("%s (%s) kann hoch fliegen.\n", this.name, this.art);
    }
}
