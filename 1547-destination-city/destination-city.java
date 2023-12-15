class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> out = new HashSet<>();
        for(int i = 0; i < paths.size(); i++){
            out.add(paths.get(i).get(0));
        }
        for(int i = 0; i < paths.size(); i++)
            if(!out.contains(paths.get(i).get(1)))
                return paths.get(i).get(1);
        return "";
    }
}
