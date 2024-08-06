import java.util.*;

public class leetcode2544{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int swap = 0;
        int ans = 0;
        int reverse = 0;
        int remainder = 0;
        int temp1 = n;
        int i = 0;
        while(temp1 != 0){
            remainder = temp1 % 10;
            reverse = reverse*10 + remainder;
            temp1 = temp1 / 10;
        }
        while(reverse != 0){
            if(i == 0){
                swap = reverse % 10;
                ans += swap;
                reverse = reverse / 10;
                i++;
            }
            else{
                swap = reverse % 10;
                ans -= swap;
                reverse = reverse / 10;
                i--;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}