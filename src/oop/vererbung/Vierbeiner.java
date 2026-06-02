package oop.vererbung;

public class Vierbeiner extends Tier {
    
    Vierbeiner(String art, String name) {
        super(art, name);
    }

    public void rennen() {
        System.out.printf("%s (%s) kann laufen!\n", this.name, this.art);
    }
}
