import java.util.Scanner;

public class B_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] x = {1,2,3,4,5};
        int[] b = new int[(x.length-1)];
        for(int i = 0;i<x.length-1;i++){
            if(a==x[i] || a<x[i]){
                b[i] = x[i+1];
            }
            else{
                b[i] = x[i];
            }
        }
        for(int i = 0;i<x.length-1;i++){
            System.out.println(b[i]);
        }
        sc.close();
    }
}