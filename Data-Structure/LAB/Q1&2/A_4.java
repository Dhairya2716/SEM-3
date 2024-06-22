import java.util.*;
public class A_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for(int i = 1;i<=n;i++){
            result = n*i;
        }
        System.out.print(result);
        sc.close();
    }
}