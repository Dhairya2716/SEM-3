int n = nums.length;
        int temp = 0;
        int[] store = new int[n]; 
        for(int i = 0;i<n;i++){
            if(i % 10 == nums[i]){
                store[i] = i;
            }
            else{
                
            }
        }
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(store[i] <= store[j]){
                    temp = store[i];
                    store[i] = store[j];
                    store[j] = temp;
                }
            }
        }
        return store[0];