// Mehrdimensionales Array mit Produkt

public class MultiArray {
    public static void main(String[] args) {
        // initialisieren 
        var multiDim = new long[10][10];

        // mit dem Produkt befuellen
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiDim[i][j] = i * j;
            }
        }

        // Ausgabe
        for (int i = 0; i < multiDim.length; i++) {
            for (int j = 0; j < multiDim.length; j++) {
                System.out.print(multiDim[i][j] + " ");
            }
            System.out.println();
        }
    }
}
