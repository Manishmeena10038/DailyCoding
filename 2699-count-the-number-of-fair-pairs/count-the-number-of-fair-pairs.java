class Solution {

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }

    private long count(int[] nums, int limit) {
        long result = 0;

        for(int low = 0, high = nums.length - 1; low < high; low++) {
            while(low < high && (nums[low] + nums[high] > limit)) high--;

            result += (high - low);
        }

        return result;
    }

}

/*


Consider this is the array :-
 ___________________________________________________________
|    |    |    |    |    |    |    |    |    |    |    |    | 
 -----------------------------------------------------------




So, this is the range for the two calls :-

                                 sum > L-1
               |--------------------------------------------|

                                                  sum > U
                                             |--------------|

___________________________________________________________
|    |    |    |    |    |    |    |    |    |    |    |    | 
 -----------------------------------------------------------
             ^    ^                        ^
             |    |                        |
            L-1   L                        U




So, definitely, this will be the range for the elements that lie
in the range Lower <= sum <= Upper :-

                  sum > L-1
               |--------------------------------------------|

                                                  sum > U
                                             |--------------|
                       L <= sum <= U

               |-----------------------------|

___________________________________________________________
|    |    |    |    |    |    |    |    |    |    |    |    | 
 -----------------------------------------------------------
             ^    ^                        ^
             |    |                        |
            L-1   L                        U



That's why we are decrementing the 'high' variable inside the while loop.
And the reason we are having the line "result += (high - low);" is because
if that is the first index of 'high' which satisfies the condition, then
all the other indices between 'low' and 'high' will satisfy too.



*/