import java.util.*;

public class C_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        String[] names = new String[n];
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        
        Arrays.sort(names);
        
        System.out.println("The names in alphabetical order are:");
        for (String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
}