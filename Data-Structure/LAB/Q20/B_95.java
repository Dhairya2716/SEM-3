public class B_95 {

    public static int max(int[] arr, int n) {
        int maximum = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    public static void countsort() {
    }

    public static void radix() {
    }

    public static void main(String[] args) {

    }
}