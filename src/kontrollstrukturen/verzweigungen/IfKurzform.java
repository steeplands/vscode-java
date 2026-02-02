package kontrollstrukturen.verzweigungen;
import helper.SavitchIn;

public class IfKurzform {
    public static void main(String[] args) {
        System.out.println("Zahl eingeben: ");
        int z = SavitchIn.readLineInt();

        boolean isGerade = (z % 2 == 0) ? true : false;
        System.out.println(isGerade);

        String isGeradeStr = (z % 2 == 0) ? "gerade" : "ungerade";
        System.out.printf("%d ist %s", z, isGeradeStr);
    }
}
