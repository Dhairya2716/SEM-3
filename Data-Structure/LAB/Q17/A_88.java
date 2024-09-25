
public class A_88 {

    public static void hashfunction(int x) {
        return (x % 18) + 2;
    }

    public static void insertfunction(int arr[], int value) {
        int key = hashfunction(value);
        int index = key;

        while (arr[index] != 0) {
            index = (index + 1) % arr.length;
        }
    }

    public static void main(String[] args) {

    }
}
