public class Countingsort {

    public static int[] counting(int[] arr){
        int n = arr.length;
        int m = 0;

        for(int i = 0;i<n;i++){
            m = Math.max(m, arr[i]);
        }

        int[] count = new int[m+1];

        for(int i = 0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i = 1;i<=m;i++){
            count[i] += count[i-1];
        }
        int[] ans = new int[n];
        for(int i = n-1;i>=0;i--){
            ans[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,8,54,35,78,32};
        int[] ans = counting(arr);
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
            }
    }
}