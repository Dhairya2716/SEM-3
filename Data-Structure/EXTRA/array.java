
import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7};
        int[] uniqueArray = removeDuplicates(array);
        for (int i : uniqueArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] removeDuplicates(int[] array) {
        // Sort the array
        Arrays.sort(array);

        // Create a new array to store unique elements
        int[] uniqueArray = new int[array.length];
        int uniqueIndex = 0;

        // Iterate over the sorted array and add unique elements to the new array
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] != array[i - 1]) {
                uniqueArray[uniqueIndex++] = array[i];
            }
        }

        // Trim the new array to the correct size
        int[] trimmedArray = new int[uniqueIndex];
        System.arraycopy(uniqueArray, 0, trimmedArray, 0, uniqueIndex);

        return trimmedArray;
    }
}
