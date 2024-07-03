import java.util.Scanner;

public class C_20 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int n = sc.nextInt();        
    String[] arr = new String[n];
    System.out.println("Enter the Names : ");
    for(int i = 0;i<n;i++){
        arr[i] = sc.next();
    }

    for(int i = 0;i<n;i++){
        for(int j = 0;j<n-1;j++){
            if(arr[j].compareTo(arr[j+1])>0){
                String temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    System.out.println(" ");
    System.out.println("Names in asecding order ---> ");
    for(int i = 0;i<n;i++){
        System.out.println(arr[i]);
    }
    sc.close();
    }
}