class Solution {
    public int minMoves(int target, int maxDoubles) {
        if(maxDoubles==0) return target-1;
        int steps = 0;

        while(target>1&&maxDoubles!=0){
            if(target%2==0&&maxDoubles>0){
                target = target/2;
                steps++;
                maxDoubles--;
            }
            else{
                target= target-1;
                steps++;
            }

        }
        return steps+(target-1);
    }
}