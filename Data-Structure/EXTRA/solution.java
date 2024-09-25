
public class solution {

    public static void main(String[] args) {
        String s = "12";
        String t = "123456789";
        int n = s.length();
        int m = t.length();
        if (n < m) {
            String s1 = t.substring(0, n);
            if (s1.equals(s)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            String t1 = s.substring(0, m);
            if (t1.equals(t)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
