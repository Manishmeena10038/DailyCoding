class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }
            else{
                char c = map.get(s.charAt(i));
                if(c!=t.charAt(i)) return false;
            }
        }
        int n1 =0;
        int n2=0;
        HashSet<Character> set1 =new HashSet<>();
        HashSet<Character> set2 =new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set1.contains(s.charAt(i))){
                n1++;
                set1.add(s.charAt(i));
            }
            if(!set2.contains(t.charAt(i))){
                n2++;
                 set2.add(t.charAt(i));
            }
        }
        if(n1!=n2) return false;
        return true;
    }
}