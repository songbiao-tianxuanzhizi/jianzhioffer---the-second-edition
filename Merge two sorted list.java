class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode l3=new ListNode(-1);
        ListNode tmp=l3;
        while((l1!=null)&&(l2!=null)){
            if(l1.val>l2.val){
                tmp.next=l2;
                l2=l2.next;
            }else{
                tmp.next=l1;
                l1=l1.next;
            }
            tmp=tmp.next;
        }
        //代码走到这里肯定是一个为空，一个不为空
        if(l1!=null){
            tmp.next=l1;
        }
        if(l2!=null){
            tmp.next=l2;
        }
        return l3.next;
    }
}
