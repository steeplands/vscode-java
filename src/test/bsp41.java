package test;

public class bsp41 { // Quadrat Tester

    public static void printQuadrat(Quadrat q) {
        System.out.println("ID: " + q.getId());
        System.out.println("s = " + q.getSeitenlaenge());
        System.out.println("U = " + q.getUmfang());
        System.out.println("A = " + q.getFlaeche());
        System.out.println();
    }

    public static void main(String[] args) {
        printQuadrat(new Quadrat());
        printQuadrat(new Quadrat(3));
        printQuadrat(new Quadrat(-8));
    }
}
