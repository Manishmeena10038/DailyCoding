class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String key:arr){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        ArrayList<String> ar = new ArrayList<>();
        for(String key:arr){
            if(map.get(key)==1) ar.add(key);
        }
        if(ar.size()>0 && k<=ar.size())
        return ar.get(k-1);
      return "";


    }
}