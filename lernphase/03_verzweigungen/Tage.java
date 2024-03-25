public class Tage {
    public static void main(String[] args) {
        // Java 12 switch statement
        String monat = "April";
        int tage;

        switch (monat) {
            case "Januar", "März", "Mai", "Juli", "August", "Oktober", "Dezember" -> {
                tage = 31;
            }
            case "April", "Juni", "September", "November" -> {
                tage = 30;
            }
            case "Februar" -> {
                tage = 28;
            }
            default -> {
                System.out.println("Ungueltiger Monatsname");
                tage = 0;
            }
        }

        if (tage != 0) {
            System.out.println("Der " + monat + " hat " + tage + " Tage!");
        }

    }
}
