import java.util.StringJoiner;
class Solution {
    public boolean makeEqual(String[] words) {
         StringJoiner joiner = new StringJoiner("");
      for(int i = 0; i < words.length; i++) {
         joiner.add(words[i]);
      }
      String str = joiner.toString();
      HashMap<Character,Integer> map = new HashMap<>();
      char[] chararr = str.toCharArray();
      for(char c:chararr){
          if(map.containsKey(c)){
              map.put(c,map.get(c)+1);
          }
          else{
              map.put(c,1);
          }
      }
      Boolean b = true;
      for(Map.Entry entry : map.entrySet()){
         int temp = (int)entry.getValue();
         if(temp%words.length!=0) return false;
         
      }
      return true;
    }
}