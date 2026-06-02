package oop.vererbung;

public class Tier {
    protected String art;
    protected String name;

    public Tier(String art, String name) {
        this.art = art;
        this.name = name;
    }
    
    public void beschreibung() {
        System.out.printf("%s (%s)\n", this.name, this.art);
    }

    public String getName() {
        return this.name;
    }
}
