import java.util.*;

public class A_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 :- ");
        String a = sc.nextLine();
        System.out.println("Enter string 2 :- ");
        String b = sc.nextLine();
        int temp = 0;
        String n = a.toLowerCase();
        String m = b.toLowerCase();
        if(a.length()!=b.length()){
            System.out.println("Given Strings are not Anagram Strings");
        }
        else{
            for(int i=0;i<a.length();i++){
                for(int j=0;j<b.length();j++){
                    if(n.charAt(i)==m.charAt(j)){    
                        temp++;
                        break;
                    }
                }    
            }
        }
        if(temp == a.length()){
            System.out.println("Given Strings are Anagram Strings");
        }
        else{
            System.out.println("Given Strings are not Anagram Strings");
        }
        sc.close();
    }
}