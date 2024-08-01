class Solution {
    public int countSeniors(String[] details) {
        int res =0;
        for(String s: details){
            int i = Integer.parseInt(s.substring(11,13));;
            if(i>60) res++;
        }
        return res;
    }
}