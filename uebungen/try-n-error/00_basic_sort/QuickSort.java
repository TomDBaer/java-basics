/*
 * In Array List schreiben
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Random;

public class QuickSort {

    public static void sortierung(int[] liste, int unterWert, int oberWert) {
        // wenn der Untere Wert den Oberen Wert erreicht wurde alles Sortiert
        if (unterWert >= oberWert) {
            return;
        }

        var letzteNummer = liste[oberWert];

        int linkerZeiger = unterWert;
        int rechterZeiger = oberWert;

        while (linkerZeiger < rechterZeiger) {

            while (liste[linkerZeiger] <= letzteNummer && linkerZeiger < rechterZeiger) {
                linkerZeiger++;
            }

            while (liste[rechterZeiger] >= letzteNummer && linkerZeiger < rechterZeiger) {
                rechterZeiger--;
            }

            wechsel(liste, linkerZeiger, rechterZeiger);
        }
        wechsel(liste, linkerZeiger, oberWert);

        sortierung(liste, unterWert, linkerZeiger - 1);
        sortierung(liste, linkerZeiger + 1, oberWert);
    }

    private static void wechsel(int[] liste, int index1, int index2) {
        int temp = liste[index1];
        liste[index1] = liste[index2];
        liste[index2] = temp;
    }

    public static void printArray(int[] array) {
        var neuesArray = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            neuesArray.add(array[i]);
        }
        System.out.println(neuesArray);
    }

    public static void main(String[] args) {

        int[] uniqueArray = new int[10];

        // Array mit zufälligen Zahlen von 1 bis 51 befüllen
        var random = new Random();
        for (int i = 0; i < uniqueArray.length; i++) {
            uniqueArray[i] = random.nextInt(1, 51);

        }

        // Start Array wiedergeben
        System.out.print("Unsortiertes Array: ");
        printArray(uniqueArray);

        // Sortierung
        sortierung(uniqueArray, 0, uniqueArray.length - 1);
        System.out.print("Sortiertes Array: ");
        printArray(uniqueArray);
    }

}
