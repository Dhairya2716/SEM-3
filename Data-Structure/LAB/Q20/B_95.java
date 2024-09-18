
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

    public static void countsort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void radixsort(int[] arr) {
        int n = arr.length;
        int m = max(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10) {
            countsort(arr, n, exp);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 9, 5, 2, 8, 6, 1, 7, 0};
        int n = arr.length;

        radixsort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
