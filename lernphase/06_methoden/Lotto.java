/*
 * Lotto
 * zahlen von 6 bis 49
 * Wir haben 6 fixe Zahlen
 * Wie oft wird gespielt bis man gewonnen hat
 * Es interresiert nur ein 6er Gewinn, nichts anderes
 */

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] meineZahlen = { 4, 8, 22, 23, 48, 1 };
        int[] lottoZahlen = new int[6];

        // Ueberpruefen ob man alle 6 Zahlen, wie oft mustte man spielen
        boolean gewonnen = false;
        int spiele = 0;

        // lottoZahlen = lottoRandomArray();
        // System.out.println(Arrays.toString(lottoZahlen));

        while (!gewonnen) {
            lottoZahlen = lottoRandomArray();
            int gleicheZahlen = vergleich(meineZahlen, lottoZahlen);
            if (gleicheZahlen == 6) {
                gewonnen = !gewonnen;
            }
            spiele++;
        }

        System.out.println("Du hast Spiele: " + spiele);

    }

    // Methode: Lotto zahlen generieren
    public static int[] lottoRandomArray() {
        // Zufalls Zahl von 6 bis 49
        final int MIN = 6;
        final int MAX = 49;
        int[] num = new int[6];

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num.length; j++) {
                if (num[j] == zufallsZahl(MIN, MAX)) {
                    /*
                     * Sollte eine Zahl schon vorhanden sein wird eine
                     * neue Liste generiert.
                     * Es waere auch moeglich die Zahl zu ersetzen
                     */
                    lottoRandomArray();
                }
            }
            num[i] += zufallsZahl(MIN, MAX);

        }

        return num;
    }

    public static int zufallsZahl(int min, int max) {
        var zufallsZahl = new Random().nextInt(min, max + 1);
        return zufallsZahl;
    }

    // Methode: Lotto zahlen mit meinen zahlen vergleichen
    public static int vergleich(int[] meineZahlen, int[] lottoZahlen) {
        int gleicheZahlen = 0;

        for (int zahl : meineZahlen) {
            for (int i = 0; i < lottoZahlen.length; i++) {
                if (zahl == lottoZahlen[i]) {
                    gleicheZahlen++;
                }
            }
        }
        return gleicheZahlen;
    }

    // wenn es 6 Zahlen hat dann return true
    public static boolean sechserLotto(int[] zahlen) {
        if (zahlen.length == 6) {
            return true;
        }
        return false;
    }
}
