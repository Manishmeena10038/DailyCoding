// class Solution {
//     public int numSubarraysWithSum(int[] nums, int goal) {
//         HashMap<Integer,Integer> map= new HashMap<>();
//         int fsum = 0;
//         int c = 0;
//         map.put(0, 1); 
//         for(int i : nums) {
//             fsum += i;
//             int csum = fsum - goal;
//             if(map.containsKey(csum)) {
//                 c += map.get(csum);
//             }
//             map.put(fsum, map.getOrDefault(fsum, 0) + 1);
//         }
//         return c;
//     }
// }

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int n=nums.length;
       /*Map<Integer,Integer> map=new HashMap<>();
       map.put(0,1);
       int psum=0;
       int res=0;
       for(int i=0;i<n;i++)
       {
           psum+=nums[i];
           int comp=psum-goal;
           res=res+map.getOrDefault(comp,0);
           if(map.containsKey(psum))
           {
               map.put(psum,map.get(psum)+1);
           }else{
               map.put(psum,1);
           }
           //map.put(psum,map.getOrDefault(psum,0)+1);
       }
       return res;*/
        //optimal
        int sum=0;
        int count=0;
        int temp=0;
        int i=0;
        for(int j=0;j<n;j++)
        {
            sum+=nums[j];
            if(nums[j]==1)
            {
                temp=0;
            }
            if(sum>goal)
            {
                sum-=nums[i];
                i++;
            }
            while(sum==goal && i<=j)
            {
                temp++;
                sum-=nums[i];
                i++;
            }
            count+=temp;
        }
        return count;
    }
}

//Explanation
/*Loop:

Iterates through the nums array with index i:

Update currSum: Add the current element nums[i] to the current running sum.
Count subarrays with goal: Get the number of times the desired prefix sum (currSum - goal) has already been encountered from the map using map.getOrDefault(currSum-goal,0). This represents the number of potential subarrays ending at the current index (i) with a sum equal to goal.
Update res: Add the counted subarrays from step 2 to the total count (res).
Track prefix sum frequency:
Check if current currSum exists in map:
Yes: If the current running sum has already been encountered, increase its frequency in the map by 1 using map.put(currSum,map.get(currSum)+1). This signifies one more subarray ending at the current index with the same prefix sum.
No: If the current running sum is encountered for the first time, add it to the map with a frequency of 1 using map.put(currSum,1).
Explanation:

This code essentially leverages the idea of "prefix sums". By keeping track of the cumulative sum at each point in the array, we can effectively check if any subarray up to that point has a sum equal to the desired goal.

The map serves as a storage for encountered prefix sums and their frequencies. When we encounter a specific currSum - goal, it implies that a subarray ending at the current index would have a sum equal to goal. The frequency of that currSum - goal in the map tells us how many such subarrays exist.

Overall, this code efficiently finds the count of subarrays with a specific sum in an array using a single pass and hash map for frequency tracking.*/
