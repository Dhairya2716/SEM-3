
/**
 * leetcode
 */
public class leetcode {

    public static void main(String[] args) {
        int candies = 10;
        int count = 0;
        int num_people = 3;
        int[] ans = new int[num_people];
        for(int i = 0;i<num_people;i++){
            int j = i+1;
            if(candies > j){
                ans[count] += j;
                candies -= j;
                System.out.println("candies "+candies);
            }
            else{
                ans[0] += candies;
                System.out.println("hi");
            }
            count++;
        }
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}