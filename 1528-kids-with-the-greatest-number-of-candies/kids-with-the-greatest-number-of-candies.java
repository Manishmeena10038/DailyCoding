class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int high = 0;

        for(int i=0;i<candies.length;i++){
            if(high<candies[i]){
                high = candies[i];
            }
        }

        List<Boolean> bool = new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=high){
                bool.add(true);
            }
            else{
                bool.add(false);
            }
        }
        return bool;
    }
}