import java.util.*;

public class leetcode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int temp = a[0];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Sorted array : ");
        for(int i = 0;i<n;i++){
            System.out.print(a[i]+" ");
           }
           System.out.println("smallest number : "+a[0]);
           System.out.println("Largest number : "+a[n-1]);
    }
}