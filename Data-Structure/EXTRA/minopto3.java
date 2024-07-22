// [1,2,3,4]
// output --> 3;
// by adding or subtracting by 1, chck where number divisible by three;


import java.util.*;


public class minopto3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int i = 0;
        for(int j = 0;j<n;j++){
            System.out.print("Element of "+j+" is ");
            arr[j] = sc.nextInt();
        }
        System.out.println("");
        System.out.println("Array is : ");
        for(int j = 0;j<n;j++){
            System.out.print(arr[j]);
        }

        System.out.println("");
        // to check 
        while(i<n){
            if((arr[i]+1) % 3 == 0 || (arr[i]-1) % 3 == 0){
                count++;
            }
            i++;
        }

        System.out.println("total is : "+count);
        sc.close();
    }
}