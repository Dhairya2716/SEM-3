import java.util.*;

public class heightchecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int k = 0;
        int count = 0;
        for(int i = 0;i<n;i++){
            System.out.print("element of "+i+" is ");
            arr[i] = sc.nextInt();
        }
        System.out.println(" ");
        System.out.println("array is : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]);
        }

        for(int i = 0;i<n;i++){
            arr1[i] = arr[i];
        }
        // sort array
        int temp = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(arr[i] <= arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(" ");
        System.out.println("sorted array : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]);
        }

        System.out.println(" ");
        System.out.println("arr1 is");
        for(int i = 0;i<n;i++){
            System.out.print(arr1[i]);
        }
        // to check same postion
        while(k<n){
            if(arr[k] != arr1[k]){
                count++;
            }
            k++;
        }
        System.out.println(" ");
        System.out.println("count : "+count);
        sc.close();
    }
}