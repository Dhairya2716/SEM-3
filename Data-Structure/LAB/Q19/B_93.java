import java.util.Scanner;

public class B_93 {  
    public static void insertionSort(int arr[]) {  
        int n = arr.length;  
        for (int j=1;j<n;j++){  
            int key = arr[j];  
            int i = j-1;  
            while((i > -1)&&( arr [i] > key)){  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
    }  
       
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];    
        System.out.println("Before Insertion Sort");    
        for(int i = 0;i<n;i++){    
            System.out.print("Element at "+i+" is "); 
            arr1[i] = sc.nextInt();   
        }    
        sc.close();
        System.out.println();    
            
        insertionSort(arr1);
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    