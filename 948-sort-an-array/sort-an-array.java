class Solution {
    public int[] sortArray(int[] nums) {
        // PriorityQueue<Integer> pr = new PriorityQueue<Integer>();
        // for(int i=0;i<nums.length;i++){
        //     pr.add(nums[i]);
        // }
        // int i=0;
        // while(!pr.isEmpty()){
        //     nums[i++] = pr.poll();
        // }
        // return nums;
         divide(nums,0,nums.length-1);
         return nums;

    }
    static void divide(int[] arr, int low , int high){
        if( low>=high) return;
        int mid = (low+high)/2;

        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);


    }

    static void merge(int[] arr, int low , int mid , int high){

        int left  = low;
        int right = mid+1;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(left<=mid && right <= high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }        
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]  = list.get(i-low);
        }

    }
}