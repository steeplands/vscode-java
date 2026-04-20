package oop;

public class Einkaufswagen {
    Produkt[] cart;
    int maxPrd;
    int pos = 0;

    public Einkaufswagen(int maxProdukte) {
        this.maxPrd = maxProdukte;
        this.cart = new Produkt[this.maxPrd];
    }

    public boolean addPrd(Produkt product) {
        if (this.pos >= this.maxPrd) {
            return false;
        }
        this.cart[pos] = product;
        this.pos++;
        return true;
    }

    public void checkout() {
        double sum = 0;
        double sumMwst = 0;

        System.out.println("     ---Kassenzettel---   ");
        System.out.printf("%-20s %s\n", "Produkt", "Preis");
        System.out.println();

        for (int i = 0; i < pos; i++) {
            sum += this.cart[i].getBrutto();
            sumMwst += this.cart[i].getMwst();

            System.out.printf("%-20s %8.2f\n", this.cart[i].name, this.cart[i].getBrutto());
        }

        System.out.println("-".repeat(29));
        
        System.out.printf("%-20s %8.2f\n", "MwSt:", sumMwst);
        System.out.printf("%-20s %8.2f\n", "Summe:", sum);
    }
}
