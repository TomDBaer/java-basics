// Schleifen for, while, do-while
// Es soll in allen Schleifen von 100 runter auf 50 gezählt werden. In 5er schritten 

public class EineSchleife {
    public static void main(String[] args) {

        // For schleife
        for (int i = 100; i >= 50; i -= 5) {
            System.out.println("Der Wert fuer i betraegt: " + i);
        }

        System.out.println("-----------");

        // While schleife
        int j = 100;
        while (j > 50) {
            j -= 5;
            System.out.println("Der Wert fuer j betraegt: " + j);
        }

        System.out.println("-----------");

        // Do-While schleife
        int k = 100;
        do {
            k -= 5;
            System.out.println("Der Wert fuer k betraegt: " + k);
        } while (k > 50);
    }
}
