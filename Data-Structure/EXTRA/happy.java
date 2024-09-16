
public class happy {

    public static void main(String[] args) {
        int n = 19;
        int count = 0;
        while (true) {
            int rem = 0;
            int product = 0;
            int temp = n;
            while(temp != 0){
                rem = temp % 10;
                product += rem * rem;
                temp /= 10;
            }
            if(product == 1){
                count = 1;
                break;
            }
            if(product > 100){
                break;
            }
            n = product;
        }
        if(count == 1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
