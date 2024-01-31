class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] arr = new int[temp.length];
       int n = temp.length;
       Stack<Integer> stack = new Stack<>();
       for(int i=0;i<n;i++){
           while(!stack.isEmpty()&&temp[i]>temp[stack.peek()]){
               int index = stack.pop();
               arr[index] = i-index;
           }
           stack.push(i);
       }
       return arr;
    }
}