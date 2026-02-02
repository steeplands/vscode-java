package arrays.multidimension;

/*
Ein magisches Quadrat ist eine quadratische Anordnung mit n Zeilen und n Spalten von Zahlen
derart, dass die Summe der Zahlen in einer beliebigen Zeile, Spalte, oder in der
Haup tdiagonale alle gleich sind.

4   3   8
9   5   1
2   7   6

Wenn n ungerade ist, kann man ein magisches Quadrat folgendermaßen erstellen. Im Feld
Q[i][j] (i=1..n, j=1..n) wird eingetragen:
1. Setzen Sie k = j i + (n 1)/2 und m = 2*j i
2. Wird k >= n , ersetzen Sie k durch k n und fahren Sie fort bei Schritt 4.
3. Wird k < 0 , ersetzen Sie k durch k + n
4. Wird m > n , so ersetzen Sie m durch m n und fahren Sie fort bei Schritt 6.
5. Wird m <= 0 , ersetzen Sie m durch m + n
6. Ergebnis: Q[i][j] = K*n + m
Erstellen Sie ein Programm, das mit diesen Regeln bei Benutzereingabe von ungeradem n ein
m agisches Quadrat erzeugt, das in einem Array gespeichert und dann am Bildschirm schön
formatiert ausgegeben wird.
*/

public class MagischeQuadrat {
    public static void main(String[] args) {
        System.out.print("Geben Sie eine ungerade Zahl für n ein: ");
        int n = helper.SavitchIn.readLineInt();

        if (n % 2 == 0) {
            System.out.println("Die Zahl ist nicht ungerade!");
            return;
        }

        int[][] Q = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = j - i + (n - 1) / 2;
                int m = 2 * j - i;

                if (k >= n) {
                    k = k - n;
                }
                if (k < 0) {
                    k = k + n;
                }
                if (m >= n) {
                    m = m - n;
                }
                if (m < 0) {
                    m = m + n;
                }

                Q[i][j] = k * n + m + 1;
            }
        }

        System.out.println("Das magische Quadrat ist:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", Q[i][j]);
            }
            System.out.println();
        }
    }
}
