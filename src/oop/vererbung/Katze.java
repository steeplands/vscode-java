package oop.vererbung;

public class Katze extends Vierbeiner {
    public Katze(String name) {
        super("Katze", name);
    }

    @Override
    public void rennen() {
        if (this.name.equals("Garfield")) {
            super.rennen();
        } else {
            System.out.printf("%s (%s) kann schnell laufen!\n", this.name, this.art);
        }
    }
}
