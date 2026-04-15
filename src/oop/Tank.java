package oop;

public class Tank {
    double volume;      // Volumen in Liter
    double level;       // Füllstand in Liter
    double rateFill;    // Füllrate in Liter/Minute
    double rateDrain;   // Entleerungsrate in Liter/Minute

    public Tank(double volume, double rateFill, double rateDrain) {
        this.volume = volume;
        this.rateFill = rateFill;
        this.rateDrain = rateDrain;
    }

    public double fillAmmount(double ammount) {
        this.level += ammount;
        return ammount / this.rateFill;
    }

    public double drainAmmount(double ammount) {
        this.level -= ammount;
        return ammount / this.rateDrain;
    }

    public double fillTime(double minutes) {
        this.level += (minutes * this.rateFill);
        return minutes * this.rateFill;
    }

    public double drainTime(double minutes) {
        this.level -= (minutes * this.rateDrain);
        return minutes * this.rateDrain;
    }

    public double getPercent() {
        return (100 * level / volume);
    }

    public void printState() {
        System.out.println("Fillrate:  " + this.rateFill  + " l");
        System.out.println("Drainrate: " + this.rateDrain + " l");
        System.out.println("Volume:    " + this.volume    + " l");
        System.out.println("Level:     " + this.level     + " l");
        System.out.println("Percent:   " + this.getPercent() + " %");
    }
}
