// import java.util.StringJoiner;
// class Solution {
//     public boolean makeEqual(String[] words) {
//          StringJoiner joiner = new StringJoiner("");
//       for(int i = 0; i < words.length; i++) {
//          joiner.add(words[i]);
//       }
//       String str = joiner.toString();
//       HashMap<Character,Integer> map = new HashMap<>();
//       char[] chararr = str.toCharArray();
//       for(char c:chararr){
//           if(map.containsKey(c)){
//               map.put(c,map.get(c)+1);
//           }
//           else{
//               map.put(c,1);
//           }
//       }
//       Boolean b = true;
//       for(Map.Entry entry : map.entrySet()){
//          int temp = (int)entry.getValue();
//          if(temp%words.length!=0) return false;
         
//       }
//       return true;
//     }
// }

// class Solution {
//     public boolean makeEqual(String[] words) {
//         int[] fre = new int[26];
//         for(int i=0;i<words.length;i++){
//             String w = words[i];

//             for(int j=0;j<w.length();j++){
//                 char ch = w.charAt(j);
//                 int idx = (int)(ch-'a');
//                 fre[idx]=fre[idx]+1;
//             }
//         }
//         for(int i=0;i<26;i++){
//             if(fre[i] % words.length!=0){
//                 return false;
//             }
//         }
//         return true ;
//     }
// }


class Solution {
    public boolean makeEqual(String[] words) {
      if (words.length == 1) {
			return true;
		}
		int totalCharCount = 0;
		for (String s : words) {
			totalCharCount += s.length();
		}
		if (totalCharCount % words.length != 0) {
			return false;
		}

		int[] myMap = new int[26];
		for (String s : words) {
			for (char c : s.toCharArray()) {
				myMap[c - 'a']++; // dem tan suat xuat hien, 'b' - 'a' = 1
			}
		}
		for (int i : myMap) {
			if (i % words.length != 0) {
				return false;
			}
		}
		return true; 
    }
}