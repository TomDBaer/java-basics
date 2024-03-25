
public class Eingabe {
    public static void main(String[] args) {
        var einlesen = new java.util.Scanner(System.in);

        // Eingabe
        System.out.print("Schreiben Sie doch bitte etwas in die Konsole: ");
        String eingabe = einlesen.nextLine();

        // Ausgabe
        System.out.println("Sie haben '" + eingabe + "' geschrieben!");

        // Scanner schliessen
        einlesen.close();
    }
}
