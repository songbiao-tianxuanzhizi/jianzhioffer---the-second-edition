class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head == null||k <= 0){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(k-1!=0){
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }else{
                return null;//代表k的值过大
            }
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
