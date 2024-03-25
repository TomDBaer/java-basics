// Fakultät berechnen, 1 bis 20
// Summe von 2 bis 30

public class Fakultaet {
    public static void main(String[] args) {

        long summe = 1;
        int i;

        for (i = 1; i <= 20; i++) {
            summe *= i;
            System.out.println("Die Summe fuer !" + i + " ist: " + summe);
        }

        System.out.println("Gesamt Summe ist: " + summe);
    }
}
