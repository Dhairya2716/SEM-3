import java.util.*;


public class A_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int c = 0;
        for(int i = 2;i<=n/2;i++){
            if(n%i==0){
            c = 1;

            break;
        }
        }
        if(c==1){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("It is a prime number");
        }
        sc.close();
    }
}