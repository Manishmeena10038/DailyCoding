class CustomStack {
    int top =-1;
    int[] arr = {};
    public CustomStack(int maxSize) {
        arr = new int[maxSize];

    }
    
    public void push(int x) {
        // if(top<maxsize)
        if(top==arr.length-1){

        }
        else
        arr[++top] = x;
    }
    
    public int pop() {
        if(top==-1){
            return -1;
        }
        int r = arr[top];
        top--;
        return r;

    }
    
    public void increment(int k, int val) {
       if(k >= top+1)
    {
        for(int i=0; i<top+1; i++)
            arr[i] = arr[i] + val;
    }
    else
    {
        for(int i=0; i<k; i++)
            arr[i] = arr[i] + val;
    }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */