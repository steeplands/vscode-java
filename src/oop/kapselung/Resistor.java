package oop.kapselung;

public class Resistor {
    private int value = 0;

    public Resistor(int value) {
        this.value = value;
    }

    public Resistor(Resistor other) {
        this.value = other.getResistanceValue();
    }

    public int getResistanceValue() {
        return this.value;
    }

    public void setResistanceValue(int resistanceValue) {
        this.value = resistanceValue;
    }

    public void seriesConnection(Resistor other) {
        this.value += other.getResistanceValue();
    }

    public void parallelConnection(Resistor other) {
        this.value = ( (this.value * other.getResistanceValue())/(this.value + other.getResistanceValue()) );
    }

    public String toString() {
        double num = this.value;
        String pre = "";

        if (this.value >= 1000000000) {
            num = this.value / 1000000000;
            pre = "G";
        } else if (this.value >= 1000000) {
            num = this.value / 1000000.0;
            pre = "M";
        } else if (this.value >= 1000) {
            num = this.value / 1000.0;
            pre = "k";
        }

        return "R = " + num + pre + "Ohm";
    }

    public static Resistor seriesConnection(Resistor r1, Resistor r2) { 
        return new Resistor(r1.getResistanceValue() + r2.getResistanceValue());
    }

    public static Resistor parallelConnection(Resistor r1, Resistor r2) {
        return new Resistor((r1.getResistanceValue() * r2.getResistanceValue()) / (r1.getResistanceValue() + r2.getResistanceValue()));
    }
}
