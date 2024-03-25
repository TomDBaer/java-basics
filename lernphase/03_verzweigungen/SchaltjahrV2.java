// Herausfinden ob mehrere Jahre ein Schaltjahr sind
// Es wird der Code vom vorherigen Schaltjahr verwendet

public class SchaltjahrV2 {
    public static void main(String[] args) {

        int startJahr = 1999;
        int endejahr = 2030;

        for (int jahr = startJahr; jahr < endejahr + 1; jahr++) {

            boolean schaltJahr;

            if (jahr % 400 == 0) {
                schaltJahr = true;
            } else if (jahr % 100 == 0) {
                schaltJahr = true;
            } else if (jahr % 4 == 0) {
                schaltJahr = true;
            } else {
                schaltJahr = false;
            }

            if (schaltJahr == true) {
                System.out.println("Das Jahr " + jahr + " befindet sich in einem Schaltjahr!");
            } else {
                System.out.println("Das Jahr " + jahr + " befindet sich *nicht* in einem Schaltjahr!");
            }
        }

    }
}
