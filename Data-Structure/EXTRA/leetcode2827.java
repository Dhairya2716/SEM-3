class leetcode2827 {
    public int numberOfBeautifulIntegers(int low, int high, int k) {
        int countodd = 0,counteven = 0,number = 0;
        for(int l = low;l<=high;l++){
            int temp = l;
            while(temp != 0){
                int digit = temp % 10;
                if(digit % 2 == 0){
                    counteven++;
                }
                else{
                    countodd++;
                }
                temp /= 10;
            }
            if(counteven == countodd){
                if(l % k == 0){
                    number++;
                }
                else{
                    continue;
                }
            }
            else{
                continue;
            }
        }
        return number;
    }
}