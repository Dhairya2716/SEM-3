import java.util.Scanner;

public class A_90 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            System.out.println("Enter the element at index "+i+" : ");
            arr[i] = sc.nextInt();
        }

        int result = linearsearch(arr,n);
        if(result == -1){
            System.out.println("Can't find the element");
        }
        else{
            System.out.println("Element found at : "+result);
        }
        sc.close();
    }

    public static int linearsearch(int[] arr,int n){
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the element to search : ");
        int target = st.nextInt();
        st.close();

        for(int i = 0;i<n;i++){
           System.out.print(arr[i]+ " ");
        }

        System.out.println();

        for(int i = 0;i<n;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}