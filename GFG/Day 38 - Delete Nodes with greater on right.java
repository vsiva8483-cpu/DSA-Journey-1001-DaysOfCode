class Solution {
    Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    Node compute(Node head) {
        
        // code here
        head=reverse(head);
        Node curr=head;
        int max=curr.data;
        while(curr!=null && curr.next!=null){
            if(curr.next.data<max){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
                max=curr.data;
            }
        }
        return reverse(head);
        
    }
}
