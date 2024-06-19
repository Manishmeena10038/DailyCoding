class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int ans =-1;
        long n = (long)m*k;
        if(n>bloomDay.length)return -1;
        for(int i:bloomDay){
            max=Math.max(i,max);
            min = Math.min(min,i);

        }
        int low = min;
        int high = max;
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                 high = mid-1;
                
            }
            else{
                low=mid+1;
                 
            }
        }
        return low;
    }
    public static boolean possible(int[] nums, int day, int m,int k){
        int cnt =0;
        int noofb=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=day){
                cnt++;
            }
            else{
                noofb+=(cnt/k);
                cnt=0;

            }
        }
        noofb+=cnt/k;
        return noofb>=m;

    }
}