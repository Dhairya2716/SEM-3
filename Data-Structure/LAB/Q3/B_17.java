import java.util.Scanner;

public class B_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("The duplicate elements are : "+i);
                    break;
                }
            }
        }

        sc.close();
    }
}
