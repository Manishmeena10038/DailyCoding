class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> fw = new ArrayList<>();
        List<Integer> ar1 = new ArrayList<>();
        List<Integer> ar0 = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<matches.length;i++){
            // map.put(map.getorDefault(0,matches[i][1])+1);
            int key = matches[i][1];
            map.put(key, map.getOrDefault(key, 0) + 1);

        } 
        for(int i=0;i<matches.length;i++){
            int key =matches[i][0];
            int key1 = matches[i][1];
            
            if(map.get(key1)==1){
                ar1.add(key1);
            }
            
            if(!map.containsKey(key)){
                if(!set.contains(key)){
                    set.add(key);
                    ar0.add(key);
                }
            }
        }
        Collections.sort(ar1);
        Collections.sort(ar0);
        fw.add(ar0);
        fw.add(ar1);
        return fw;


    }
}