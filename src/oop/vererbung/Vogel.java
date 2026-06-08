package oop.vererbung;

public class Vogel extends Tier {
    public Vogel(String art, String name) {
        super(art, name);
    }

    public void fliegen() {
        System.out.printf("%s (%s) kann fliegen.\n", this.name, this.art);
    }
}
