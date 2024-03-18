// Bessere Doku schreiben || UNBEDINGT

// Klasse Auto
class Auto {
    String name;
    Auto next;

    // Konstruktor
    Auto(String name) {
        this.name = name;
        this.next = null;
    }
}

// Klasse Liste
class AutoHaendler {
    Auto anfang;

    // Konstruktor
    AutoHaendler() {
        this.anfang = null;
    }

    // Methoden

    // hinzufuegen
    public void add(String name) {
        var neuesAuto = new Auto(name);

        if (anfang == null) {
            anfang = neuesAuto;
            return;
        }

        /*
         * Hier wird auf das jetzige Objekt gezeigt.
         * Solange das nachfolgende Objekt nicht null ist
         * kommt man nicht in die letzte Zeile, in der man
         * dann das letzte Objekt, welches null ist, mit einem neuen
         * Objekt belegt
         */
        // momentane Postion im Array
        var jetzigePosition = anfang;
        // die jetzige Position +1 ist was?
        while (jetzigePosition.next != null) {
            jetzigePosition = jetzigePosition.next;
        }

        // an die jetzige position ein Objekt setzen
        jetzigePosition.next = neuesAuto;
    }

    public void show() {
        // Anfang der Liste
        var jetzigePosition = anfang;

        while (jetzigePosition != null) {
            System.out.println(jetzigePosition.name);
            jetzigePosition = jetzigePosition.next;
        }
    }
}

public class BasicLinked {
    public static void main(String[] args) {
        var neueListe = new AutoHaendler();

        neueListe.add("Audi");
        neueListe.add("Mercedes");
        neueListe.add("Toyota");

        neueListe.show();
    }
}
