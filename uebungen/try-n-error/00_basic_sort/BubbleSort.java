import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        var bubbleArray = new ArrayList<Integer>();
        var random = new Random();

        // Liste mit zufaelligen Zahlen befuellen
        for (int i = 0; i < 6; i++) {
            int newRandom = random.nextInt(1, 21);
            bubbleArray.add(newRandom);
        }

        int platzhalter = 0;

        for (int i = 0; i < bubbleArray.size() - 1; i++) {
            for (int j = 0; j < bubbleArray.size() - i - 1; j++) {
                if (bubbleArray.get(j) > bubbleArray.get(j + 1)) {
                    // Elemente auswechseln
                    platzhalter = bubbleArray.get(j);
                    bubbleArray.set(j, bubbleArray.get(j + 1));
                    bubbleArray.set(j + 1, platzhalter);
                }
            }
        }

        // Array?
        // System.out.println("Das Array: " + bubbleArray);
        for (int i = 0; i < (bubbleArray.size()); i++) {
            System.out.println(bubbleArray.get(i));
        }
    }
}
