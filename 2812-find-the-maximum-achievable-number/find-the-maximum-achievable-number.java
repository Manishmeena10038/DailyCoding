class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int i =0;
        while(i<t){
            num = num+2;
            i++;
        }

        return num;
    }
}