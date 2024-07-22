import java.util.*;

/**
 * leetcode
 */
public class leetcode {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 5};
        int n =  nums.length;
        for(int i = 0;i < n ;i++){
            for(int j = i+1;j<n;j++){
                if(nums[i] == nums[j]){
                    System.out.println();
                }
            }
        }
    }
}