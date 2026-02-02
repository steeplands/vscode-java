package kontrollstrukturen.schleifen;
import helper.SavitchIn;

public class DoWhileSumN {
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        int i = 1;

        System.out.printf("N eingeben: ");
        n = SavitchIn.readLineInt();

        do {
            sum += i;
            i++;
        } while(n >= i);

        System.out.printf("SummeN von %d = %d", n, sum);
    }
}
