class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> line = new ArrayList<>();
        func(0,s,line,ans);
        return ans;


    }
    static void func(int index, String s, List<String> line, List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(line));
            return;
        }
        for(int i=index;i<s.length();++i){
            if(ispal(s,index,i)){
                line.add(s.substring(index,i+1));
                func(i+1,s,line,ans);
                line.remove(line.size()-1);
            }
        }
    }
    static boolean ispal(String s, int start, int end ){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}