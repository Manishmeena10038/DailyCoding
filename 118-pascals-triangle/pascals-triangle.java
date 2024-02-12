class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> arr =  new ArrayList<>();
      for(int c=1;c<=numRows;c++){
          ArrayList<Integer> temp = new ArrayList<>();
          int ans = 1;
          temp.add(ans);
          for(int i=1;i<c;i++){
              ans = ans*(c-i);
              ans = ans/i;
              temp.add(ans);
          }
          arr.add(temp);
      }
      return arr;
    }
}