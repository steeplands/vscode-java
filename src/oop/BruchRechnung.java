package oop;

public class BruchRechnung {
    public static void main(String[] args) {

        Bruch a = new Bruch(2,3);
        Bruch b = new Bruch(7,13);
        Bruch c = new Bruch(5,4);

        System.out.println("Testbrueche");
        System.out.println(a + ", " + b + ", " + c);
        System.out.println();

        // ADDITION
        System.out.println("Addition:");
        System.out.println(a + " + " + b + " = " + a.add(b));
        System.out.println(a + " + " + c + " = " + a.add(c));
        System.out.println(b + " + " + c + " = " + b.add(c));
        System.out.println();

        // SUBTRACTION
        System.out.println("Subtraktion:");
        System.out.println(a + " - " + b + " = " + a.sub(b));
        System.out.println(a + " - " + c + " = " + a.sub(c));
        System.out.println(c + " - " + b + " = " + c.sub(b));
        System.out.println();

        // MULTIPLICATION
        System.out.println("Multiplikation:");
        System.out.println(a + " * " + b + " = " + a.mult(b));
        System.out.println(a + " * " + c + " = " + a.mult(c));
        System.out.println(b + " * " + c + " = " + b.mult(c));
        System.out.println();

        // DIVISION
        System.out.println("Division:");
        System.out.println(a + " / " + b + " = " + a.div(b));
        System.out.println(a + " / " + c + " = " + a.div(c));
        System.out.println(c + " / " + b + " = " + c.div(b));
        System.out.println();

        // NEGATION
        System.out.println("Negation:");
        System.out.println("neg(" + a + ") = " + a.neg());
        System.out.println("neg(" + b + ") = " + b.neg());
        System.out.println("neg(" + c + ") = " + c.neg());
        System.out.println();

        // INVERSE
        System.out.println("Kehrwert:");
        System.out.println("inv(" + a + ") = " + a.inv());
        System.out.println("inv(" + b + ") = " + b.inv());
        System.out.println("inv(" + c + ") = " + c.inv());
    }
}
