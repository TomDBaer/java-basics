/*
    Test kleines Telefonbuch
    Key: TelNr, Value: Name
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class BasicHash {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var random = new Random();
        var neuerHash = new HashMap<Integer, String>();
        String[] namen = {
                "Anna Müller",
                "Max Schmidt",
                "Sophia Fischer",
                "Lukas Weber",
                "Emma Schneider",
                "Benjamin Meyer",
                "Laura Wagner",
                "Julian Müller",
                "Emma Schmidt",
                "Benjamin Fischer"
        };
        Arrays.sort(namen);

        for (int i = 0; i < 5; i++) {
            int neueNummer = random.nextInt(100000, 999999);
            neuerHash.put(neueNummer, namen[i]);
        }

        System.out.println("Welche nummern gibt es?");
        for (int i = 0; i < neuerHash.size(); i++) {
            System.out.println(neuerHash.keySet().toArray()[i]);
        }

        System.out.println("Bitte geben Sie die Nummer an um eine Person zu suchen:");
        int nummer = in.nextInt();

        if (neuerHash.containsKey(nummer)) {
            System.out.println(neuerHash.get(nummer));
        } else {
            System.out.println("Diese Person existiert nicht in unsere Datenbank");

        }

        in.close();
    }
}
