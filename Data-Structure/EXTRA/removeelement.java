import java.util.Scanner;

/**
 * removeelement
 */
public class removeelement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.print("Enter value of k = ");
        int k = sc.nextInt();
        int[] arr1 = new int[n - 1];
        for(int i = 0;i<n;i++){
            if(i < k){
                continue;
            }
            arr1[i] = arr[i];
        }
        sc.close();
    }
}