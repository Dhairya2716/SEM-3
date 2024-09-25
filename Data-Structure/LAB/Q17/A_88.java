
import java.util.Arrays;

public class A_88 {

    public static int hashFunction(int x, int arrayLength) {
        return (x % arrayLength) + 2;
    }

    public static void insertFunction(int arr[], int value) {
        int key = hashFunction(value, arr.length);
        int index = key;

        if (index >= arr.length) {
            index = index % arr.length;
        }

        while (arr[index] != 0) {
            index = (index + 1) % arr.length;
        }

        arr[index] = value;
    }

    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i < 15; i++) {
            int randomValue = (int) (Math.random() * 1000000);
            while (randomValue < 99999) {
                if (randomValue > 100000 && randomValue < 1000000) {
                    break;
                }
                randomValue = (int) (Math.random() * 1000000);
            }
            insertFunction(arr, randomValue);
        }
        System.out.println("Final array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
