package oop.kapselung;

public class Bank {
    private Bankkonto[] konten;
    private int kontoInkre = 0;
    private int maxKonten;

    public Bank(int maxKonten) {
        this.maxKonten = maxKonten;
        this.konten = new Bankkonto[maxKonten];
    }

    public boolean newAccount(String owner) {
        if (this.kontoInkre == maxKonten - 1) {
            return false;
        }
        this.konten[this.kontoInkre] = new Bankkonto(owner);
        this.kontoInkre++;
        return true;
    } 

    public Bankkonto getAccount(String owner) {
        for (Bankkonto bankkonto : this.konten) {
            if (bankkonto.getOwner().equals(owner)) {
                return bankkonto;
            }
        }
        return null;
    }
}
