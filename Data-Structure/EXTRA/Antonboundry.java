import java.util.*;

public class Antonboundry {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
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
                count += arr[i];
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("count = "+count);
        System.out.println(" ");
        if(count == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }    
}
