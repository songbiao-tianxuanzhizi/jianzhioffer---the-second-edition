public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null){
            return null;
        }
        //创建新链表的头节点
        ListNode newHead=new ListNode(-1);
        //cur指针指向原链表的头节点pHead
        ListNode cur=pHead;
        //tmp指针指向新链表的头节点newHead
        ListNode tmp=newHead;
        while(cur!=null){
            //要加cur.next!=null
            if((cur.next!=null)&&(cur.val==cur.next.val)){
                //要加cur.next!=null
                while(cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                //要多走一步
                cur=cur.next;
            }else{
                tmp.next=cur;
                tmp=tmp.next;
                cur=cur.next;
            }
        }
        //特殊情况
        tmp.next=null;
        return newHead.next;
    }
}
