import java.util.Scanner;

public class A_31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row for 1st matrix: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns 1st matrix: ");
        int m = sc.nextInt();
        System.out.print("Enter number of row for 2nd matrix: ");
        int x = sc.nextInt();
        System.out.print("Enter number of columns 2nd matrix: ");
        int y = sc.nextInt();
        int arr[][] = new int[n][m];
        int arr1[][] = new int[x][y];
        int arr2[][] = new int[n][y];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr1[i][j] = sc.nextInt();

            }
        }
        if(m==x){
            for(int i = 0;i<n;i++){
                for(int j = 0;j<y;j++){
                    for(int k = 0;k<m;k++){
                        arr2[i][j] += arr[i][k] * arr1[k][j];
                    }
                }
            }
        }
        else{
            System.out.println("Enter valid matrix");
        }
        System.out.println("Matrix is : ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<y;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}