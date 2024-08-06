import java.util.Scanner;

public class A_91{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        sc.close();
        for(int i = 0;i<n;i++){
            System.out.println("Enter the element at index "+i+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();
        
        int result = binarySearch(arr, 0, n - 1, key);
        if(result == -1){
            System.out.println("Result can't be found");
        }
        else{
            System.out.println("the index is "+result);
        }
    }

    public static int binarySearch(int[] arr,int left,int right,int key){
        while(left<=right){
            int mid = left+(right-left)/2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
}