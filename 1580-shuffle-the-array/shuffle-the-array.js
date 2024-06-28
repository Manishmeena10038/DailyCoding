/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    // const ans = [];
    // for(let i=0;i<n;i++){
    //     ans.push(nums[i],nums[n+i]);
    // }
    // return ans;
    let i=0;
    let count=2*n;
    let Arr = [];
    while(count){
        Arr.push(nums[i++]);
        Arr.push(nums[n++]);
        count-=2;
    }
    return Arr;
};