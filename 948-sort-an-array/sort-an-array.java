class Solution {
    public int[] sortArray(int[] arr) {
        
        // int ind = 0;
        // for(int i=0;i<arr.length;i++){
        //       int min = Integer.MAX_VALUE;
        //     for(int j=i;j<arr.length;j++){
        //         if(arr[j]<=min){
        //             min = arr[j];
        //             ind = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[ind];
        //     arr[ind] = temp;
            
        // }
        // return arr;


        // int max = Integer.MIN_VALUE;
        // for(int i=arr.length-1;i>=0;i--){
        //     int swap = 0;
        //     for(int j=0;j<i;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1]=temp;
        //             swap = 1;
        //         }
               
        //     }
        //      if(swap==0) break;
        // }
        // return arr;

        // for(int i=0;i<arr.length;i++){
        //     int j =i;
        //     while(j>0&&arr[j]<arr[j-1]){
        //         int temp = arr[j-1];
        //         arr[j-1] = arr[j];
        //         arr[j]=temp;
        //         j--;
                
        //     }
        // }
        // return arr;

        // divide(arr,0,arr.length-1);
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i:arr){
            q.add(i);
        }
        int i=0;
        while(!q.isEmpty()){
            arr[i++] = q.poll();
        }
       
        return arr;
    }
    // public static void divide(int[] arr, int low, int high){
    //     if(low>=high){
    //         return;
    //     }
    //     int mid = (low+high)/2;
    //     divide(arr,low,mid);
    //     divide(arr,mid+1,high);
    //     merge(arr,low,mid,high);
        
    // }
    // public static void merge(int[] arr, int low ,int mid,int high){
    //     int left=low;
    //     int right = mid+1;
    //     ArrayList<Integer> temp = new ArrayList<>();

    //     while(left<=mid&&right<=high){
    //         if(arr[left]<=arr[right]){
    //             temp.add(arr[left]);
    //             left++;
    //         }
    //         else{
    //             temp.add(arr[right]);
    //             right++;
    //         }
    //     }
    //     while(left<=mid){
    //         temp.add(arr[left]);
    //         left++;
    //     }
    //     while(right<=high){
    //         temp.add(arr[right]);
    //         right++;
    //     }

    //     for(int i=low;i<=high;i++){
    //         arr[i] = temp.get(i-low);
    //     }
    // }
}