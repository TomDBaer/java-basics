// Herausfinden ob das angegeben Jahr ein Schaltjahr ist

public class Schaltjahr {
    public static void main(String[] args) {
        int jahr = 2024; // ist diesesr ein Schaltjahr
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
