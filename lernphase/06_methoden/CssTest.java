/*
 * Methode soll testen ob der uebergebene Wert ein
 * moeglicher CSS Farbcode ist 
 */

public class CssTest {
    public static void main(String[] args) {
        String testString = "#12AB34";

        System.out.println(istRGB(testString));

    }

    public static boolean istRGB(String wert) {
        // Hat der string ein #
        if (!wert.contains("#")) {
            return false;
        }

        // Der Wert ohne # und alles in kleinschreibweisse
        String wertKlein = wert.substring(1).toLowerCase();

        // Laenge ueberpruefen
        int laengeWert = wertKlein.length();
        if (laengeWert != 2 && laengeWert != 4 && laengeWert != 6) {
            return false;
        }

        // Hat der RGB Wert die richtigen Zahlen/Buchstaben
        for (char buchstabe : wertKlein.toCharArray()) {
            // char in einen String wandeln "" + char
            if (!"abcdef0123456789".contains("" + buchstabe)) {
                System.out.println("Hier");
                return false;
            }
        }

        return true;

    }
}
