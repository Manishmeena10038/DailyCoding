class Solution {
    public boolean judgeCircle(String moves) {
        int d = 0;
        boolean b = false;
      for(char c:moves.toCharArray()){
          if(c=='R')
             d+=1;
          if(c=='L')
              d-=1;
          if(c=='U')
              d+=10;
          if(c=='D')
              d-=10;
      } 
      if(d==0)
          b  = true;
       
      return b;
    }
}