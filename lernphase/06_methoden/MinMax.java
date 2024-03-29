
public class MinMax {
    public static void main(String[] args) {

        int[] myArray = { 3, 8, 12, 55, 54, 83, 1, 9 };

        int minOfArray = minimum(myArray);
        int maxOfArray = maximum(myArray);
        System.out.println("Minimum ist: " + minOfArray);
        System.out.println("Maximum ist: " + maxOfArray);
    }

    // Methoden die min und max herausfindet
    public static int minimum(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
