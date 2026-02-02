package arrays.multidimension;

import helper.SavitchIn;

/*
Definieren Sie ein 2 dim. Int Array.
Lesen Sie von der Tastatur die Anzahl der Zeilen
Lesen Sie von der Tastatur die Anzahl der Spalten
Alloziieren (reservieren) Sie Speicher für das Array (Tipp: new ....)
Schreiben Sie Zufallszahlen in das Array
Geben Sie das Array aus
*/

public class Arr1 {
    public static void main(String[] args) {
        System.out.print("Rows: ");
        int rows = SavitchIn.readLineInt();
        System.out.print("Collums: ");
        int colls = SavitchIn.readLineInt();

        int[][] array = new int[rows][colls];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < colls; j++) {
                array[i][j] = tortuga.Piratenschlacht.getPoints(0, 20);
            }
        }

        System.out.println("------------------------");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < colls; j++) {
                System.out.print("[" + array[i][j] + "] ");
            }
            System.out.println(" ");
        }
    }
}
