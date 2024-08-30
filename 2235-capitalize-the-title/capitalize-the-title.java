class Solution {
    public String capitalizeTitle(String title) {

       StringBuilder sb = new StringBuilder();
       String[] arr = title.split(" ");
       for(String word: arr){
        String word1 = word.toLowerCase();
        if(word1.length()<=2){
            sb.append(word1);
            sb.append(" ");

        }
        else{
            String fp = word1.substring(0,1);
            String sp = word1.substring(1,word1.length());
            sb.append(fp.toUpperCase());
            sb.append(sp);
            sb.append(" ");
        }
       }
       return sb.toString().trim();


    }
}