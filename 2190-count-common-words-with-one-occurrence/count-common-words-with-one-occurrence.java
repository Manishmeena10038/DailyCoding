class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> m1 = new HashMap<>();
        HashMap<String,Integer> m2 = new HashMap<>();
        for(String r:words1){
            m1.put(r,m1.getOrDefault(r,0)+1);
        }
        for(String r:words2){
            m2.put(r,m2.getOrDefault(r,0)+1);
        }
        int count=0;
        for(String r:words1){
            if(m1.containsKey(r)&&m2.containsKey(r))
            if(m1.get(r)==1&&m2.get(r)==1) count++;
        }


        return count;

    }
}