import java.util.Scanner;

class sum1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        System.out.println("Enter values : ");
        for(int i = 0;i<n;i++){
            System.out.println("Element of "+i+" is "+nums[i]);
        }
        for(int i = 0;i<n;i++){
            sum += nums[i];
            nums[i] = sum;
        }
        System.out.println(nums);
        sc.close();
    }
}