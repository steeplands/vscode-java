package oop;

public class Smartphone {
    int capacity;   //in mAh
    int level;      //in %
    int calltime;   //in min.

    public Smartphone(int capacity) {
        this.capacity = capacity;
        this.level = 100;
        this.calltime = 0;
    }

    public Smartphone() {
        this(5000);
    }

    public void call(int minutes) {
        this.level -= (minutes * 2);
        this.calltime += minutes;
        System.out.printf("Akkustand in %d%%, Gesprächsdauer: %d Minuten\n", level, calltime);
    }

    public void charge(int wattage) {
        double chargeTime = this.capacity * (100 - level) / 100 / wattage;
        this.level = 100;
        System.out.printf("Ladezeit: %.2f h\n", chargeTime);
    }

    public static void main(String[] args) {
        Smartphone phone = new Smartphone(4000);
        phone.call(4);
        phone.call(5);
        phone.charge(75);
    }
}
