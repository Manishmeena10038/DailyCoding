import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] words) {
        // Map to store anagram groups
        Map<String, List<String>> map = new HashMap<>();
        for(String word: words){
            char[] ca = word.toCharArray();
            Arrays.sort(ca);
            String s = new String(ca);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>(List.of(word)));
            }
            else{
                map.get(s).add(word);
            }

        }
        return new ArrayList<>(map.values());
    }
}