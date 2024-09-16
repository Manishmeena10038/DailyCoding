class Solution {

    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            String str  = timePoints.get(i);
            int hr = Integer.parseInt(str.substring(0,2));
            int min = Integer.parseInt(str.substring(3));

            arr[i] = hr*60+min;
        }

        Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            min = Math.min(min,(arr[i]-arr[i-1]));

        }

        return Math.min(
            min, (24*60 - arr[n-1] + arr[0])
        );
    }
}