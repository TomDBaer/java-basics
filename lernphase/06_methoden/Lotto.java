/*
 * Lotto
 * zahlen von 6 bis 49
 * Wir haben 6 fixe Zahlen
 * Wie oft wird gespielt bis man gewonnen hat
 * Es interresiert nur ein 6er Gewinn, nichts anderes
 * 
 * !Es kann noch immer passieren das ich doppelte Nummern in meinem Array habe 
 */

import java.util.Random;

public class Lotto {
    public static final Random zufall = new Random();

    public static void main(String[] args) {
        int[] meineZahlen = { 13, 23, 18, 8, 39, 19 };
        int[] lottoZahlen = new int[6];

        // Ueberpruefen ob man alle 6 Zahlen, wie oft mustte man spielen
        boolean gewonnen = false;
        int spiele = 0;

        while (!gewonnen) {
            // while (spiele <= 1000) {
            lottoZahlen = lottoRandomArray();
            int gleicheZahlen = vergleich(meineZahlen, lottoZahlen);
            if (gleicheZahlen == 6) {
                gewonnen = !gewonnen;
            }
            spiele++;
        }

        System.out.println("Du hast " + spiele + " Spiele gespielt bis du einen Secher bekommen hast!");

    }

    // Methode: Lotto zahlen generieren
    public static int[] lottoRandomArray() {
        // Zufalls Zahl von 6 bis 49
        final int MIN = 6;
        final int MAX = 49;
        int[] num = new int[6];

        for (int i = 0; i < num.length; i++) {
            int zahl = zufallsZahl(MIN, MAX);
            for (int j : num) {
                if (j == zahl) {
                    zahl = zufallsZahl(MIN, MAX);
                }
            }
            num[i] = zahl;
        }

        return num;
    }

    public static int zufallsZahl(int min, int max) {
        return zufall.nextInt(min, max + 1);
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
