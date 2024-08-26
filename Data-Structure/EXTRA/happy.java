public class happy {
    public static void main(String[] args) {
        int n = 19;
        int temp = n;
        int sum = 0;
        while (sum != 1) {
            do {
                sum += (temp % 10)*(temp % 10);
                temp /= 10;
                boolean flag = true;
            } while (temp > 0);   
        }
        System.out.println(sum);
    }
}