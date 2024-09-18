
import java.util.Arrays;

public class trial {

    public static void main(String[] args) {
        int[] nums = {10, 2};
        String largestNum = largestNumber(nums);
        System.out.println(largestNum);
    }

    public static String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder sb = new StringBuilder();
        for (String str : strNums) {
            sb.append(str);
        }

        return sb.toString();
    }
}
