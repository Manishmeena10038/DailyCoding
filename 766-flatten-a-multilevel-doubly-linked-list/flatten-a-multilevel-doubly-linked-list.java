/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        Stack<Node> stk = new Stack<>();
        while(head!=null){
            if(head.child!=null){
                if(head.next!=null)
                stk.push(head.next);
                head.next=head.child;
                head.child.prev=head;
                head.child=null;

            }
             
            else if(head.next==null&&!stk.isEmpty()){
              
           
                Node t = stk.pop();
                head.next = t;
                t.prev = head;

             
            }
             head=head.next;
            // head.next.prev=head;
        }
        return temp;
    }
}