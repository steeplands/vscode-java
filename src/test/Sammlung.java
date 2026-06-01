package test;

public class Sammlung {
    private Quadrat[] sammlung;

    // private int lastIdx = 4;
    
    private int nrOfQuadrate = 0;

    public Sammlung() {
        this.sammlung = new Quadrat[20];
    }

    public boolean removeQuadrat() {
        if (this.nrOfQuadrate == 1) {
            return false;
        }
        return false;
    }

    /*
    public boolean addQuadrat(Quadrat newQ) {
        if (nrOfQuadrate == sammlung.length) {
            return false;
        } else {
            this.sammlung[this.lastIdx] = newQ;
            this.nrOfQuadrate++;
            return true;
        }
    }

    public boolean removeQuadrat() {
        if (this.sammlung[nextIdx]) {
            
        }
        return false;
    }
    */

    public void print() {
        System.out.println("Sammlung");

        for (Quadrat q : sammlung) {
            System.out.println("Quadrat: s = " + q.getSeitenlaenge());
        }
    }
}
