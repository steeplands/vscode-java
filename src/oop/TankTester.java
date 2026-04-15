package oop;

public class TankTester {
    public static void main(String[] args) {
        Tank t1 = new Tank(500, 100, 200);

        System.out.println(t1.fillAmmount(500) + "min.");
        t1.printState();

        System.out.println();

        t1.drainTime(1);
        t1.printState();
    }
}
