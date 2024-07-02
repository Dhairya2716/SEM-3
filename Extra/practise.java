import java.util.*;

public class practise{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the element : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        int temp = 0;
        System.out.println("Enter the element : ");
        for(int i = 0;i<n;i++){
            System.out.print("Element ");
            array[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        System.out.println("The largest number is "+array[n-1]);
        sc.close();
    }
}