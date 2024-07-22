import java.util.*;
// question number 2500 (leetcode-array);
/**
 * highnumarray
 */
public class checkhighnumarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array  : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int ans = 0;
        // arr
        for(int i = 0;i<n;i++){
            System.out.print("element of "+i+" is ");
            arr[i] = sc.nextInt();
        }
        System.out.println(" ");
        System.out.println("array is : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]);
        }

        // arr1
        for(int i = 0;i<n;i++){
            System.out.print("element of "+i+" is ");
            arr1[i] = sc.nextInt();
        }
        System.out.println(" ");
        System.out.print("array is : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr1[i]);
        }
        System.out.println(" ");
        // temp to store value
        int temp = 0;

        // sort arr
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(arr[i] <= arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // sort arr1
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(arr1[i] <= arr1[j]){
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        System.out.println(" ");
        System.out.println("Sorted arrays : ");
        System.out.println("arr : ");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println(" ");
        System.out.println("arr1 : ");
        for(int i =0;i<n;i++){
            System.out.print(arr1[i]);
        }

        // compare
        for(int i = n;i>0;i--){
            if(arr[i] > arr1[i]){
                ans += arr[i];
            }
            else{
                ans += arr1[i];
            }
        }
        System.out.println("ans is : "+ans);
        sc.close();
    }
}