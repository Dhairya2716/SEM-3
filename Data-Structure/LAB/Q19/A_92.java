import java.util.Scanner;

public class A_92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int temp = 0;

        for(int i = 0;i<n;i++){
            System.out.print("element at index "+i+" is ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(arr[i] <= arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("bubble sorted elements are : ");
        
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}
