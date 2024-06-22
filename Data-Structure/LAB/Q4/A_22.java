import java.util.*;

public class A_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("location of element : ");
        int l = sc.nextInt();

        int[] ar = new int[n-1];

        for(int j = 0;j<ar.length;j++){
            if(j<l){
                ar[j] = arr[j];
            }
            else{
                ar[j] = arr[j-1];
            }
        }
        System.out.println(Arrays.toString(ar));
        sc.close();
    }
}