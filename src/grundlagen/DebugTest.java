package grundlagen;
public class DebugTest {
    public static void main(String[] args) {
        int n = 5;
        int m = 10;

        while (n <= m) {
            n++;
            if (n % 2 == 0)
                continue;
            if (n == 9)
                break;
            System.out.println("n = " + n);
        }
        
        System.out.println("n = " + n);
    }
}
