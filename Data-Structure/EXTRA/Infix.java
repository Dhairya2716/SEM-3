
public class Infix {

    public static void main(String[] args) {
        long lowerBound = 20;
        long upperBound = 1159;
        int digitLimit = 5;
        String s = "20";
        int count = 0;
        for (int i = 1; i <= digitLimit; i++) {
            String newNumber = i + s;
            long number = Long.parseLong(newNumber);
            if (number <= upperBound && number >= lowerBound) {
                count++;
            }
        }
        System.out.println(count);
    }
}
