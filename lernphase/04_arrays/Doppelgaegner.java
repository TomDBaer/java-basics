/*
 * Hier soll herausgefunden werden ob es 
 * eine Zahl in einem Array doppel gibt
 */

public class Doppelgaegner {
    public static void main(String[] args) {
        int[] x = { 5, 8, 9, 3, 6, 8 };

        boolean doppelgaenger = false;

        while (!doppelgaenger) {
            for (int i = 0; i < x.length - 1; i++) {
                for (int j = i + 1; j < x.length; j++) {
                    // Die erste Nummer wird mit allen Nummer im Array verglichen
                    if (x[i] == x[j]) {
                        System.out.println("Die Zahl " + x[i] + " gibt es doppelt");
                        doppelgaenger = true;
                    }
                }
            }
        }
    }
}
