package oop;

public class Bruch {

    private long zaehler;
    private long nenner;

    public Bruch() {
        zaehler = 0;
        nenner = 1;
    }

    public Bruch(long z) {
        zaehler = z;
        nenner = 1;
    }

    public Bruch(Bruch br) {
        zaehler = br.zaehler;
        nenner = br.nenner;
    }

    public Bruch(long z, long n) {
        zaehler = z;
        nenner = n;
        kuerze();
    }

    public long getZaehler() {
        return zaehler;
    }

    public long getNenner() {
        return nenner;
    }

    public void setZaehler(long z) {
        zaehler = z;
    }

    public void setNenner(long n) {
        nenner = n;
    }

    public String toString() {
        return zaehler + "/" + nenner;
    }

    public Bruch neg() {
        return new Bruch(-zaehler, nenner);
    }

    public Bruch inv() {
        return new Bruch(nenner, zaehler);
    }

    public Bruch add(Bruch a) {
        long z = zaehler * a.nenner + a.zaehler * nenner;
        long n = nenner * a.nenner;
        return new Bruch(z, n);
    }

    public Bruch sub(Bruch a) {
        long z = zaehler * a.nenner - a.zaehler * nenner;
        long n = nenner * a.nenner;
        return new Bruch(z, n);
    }

    public Bruch mult(Bruch a) {
        return new Bruch(zaehler * a.zaehler, nenner * a.nenner);
    }

    public Bruch div(Bruch a) {
        return new Bruch(zaehler * a.nenner, nenner * a.zaehler);
    }

    private void kuerze() {
        long g = ggt(Math.abs(zaehler), Math.abs(nenner));
        zaehler /= g;
        nenner /= g;
    }

    private long ggt(long m, long n) {
        while (n != 0) {
            long r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}
