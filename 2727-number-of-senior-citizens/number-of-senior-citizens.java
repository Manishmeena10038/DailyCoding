class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String s:details){
            // int m =  Integer.parseInt(s.substring(11,13));
             int age=(s.charAt(11)-'0')*10+s.charAt(12)-'0';

            // if(m>60){
            if(age>60){
                count++;
            }
            //  Integer.parseInt()
        }
        return count;
    }
}