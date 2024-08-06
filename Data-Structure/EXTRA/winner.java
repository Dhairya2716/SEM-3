/**
 * winner
 */
public class winner {

    public static void main(String[] args) {
        int[] nums = {1,2,233,7};
        int n = nums.length;
        int temp = nums.length;
        int player1 = 0;
        int player2 = 0;
        int i = 0;
        while(temp!=0){
            if(i == 0){
                if(nums[0] > nums[n-1] && nums[n-2] > nums[n-1]){
                    player1 += nums[0];
                    i++;
                }
                else{
                    player1 += nums[n-1];
                    i++;
                }
            }
            else{
                if(nums[0] > nums[n-1] && nums[n-2] > nums[n-1]){
                    player2 += nums[0];
                    i--;
                }
                else{
                    player2 += nums[n-1];
                    i--;
                }
            }
            temp--;
        }
        System.out.println("player 1 : "+player1);
        System.out.println("player 2 : "+player2);
    }
}