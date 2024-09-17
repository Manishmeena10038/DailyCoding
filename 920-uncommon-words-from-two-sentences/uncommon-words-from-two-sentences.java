class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        String ans = "";
        StringBuilder sb = new StringBuilder();

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<str1.length;i++){
            map.put(str1[i],map.getOrDefault(str1[i],0)+1);
        }
        for(int i=0;i<str2.length;i++){
            map.put(str2[i],map.getOrDefault(str2[i],0)+1);
        }

        for(int i=0;i<str1.length;i++){
            if(map.get(str1[i])<2){
                ans = ans+" "+ str1[i];
            }
        }
       for(int i=0;i<str2.length;i++){
            if(map.get(str2[i])<2){
                ans = ans+" "+ str2[i];
            }
        }
        ans = ans.trim();
        if(ans.length()==0) return new String[]{};
        return ans.split(" ");
    }
}