package kontrollstrukturen.schleifen;
import helper.SavitchIn;

public class ForSumN {
    public static void main(String[] args) {

        System.out.printf("N eingeben: ");
        int n = SavitchIn.readLineInt();
        int sum = 0;

        for(int i = 1; n >= i; i++) {
            sum += i;
        }
        
        System.out.printf("SummeN von %d = %d", n, sum);
    }
}
