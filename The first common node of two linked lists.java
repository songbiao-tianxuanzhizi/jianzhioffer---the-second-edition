public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length=0;
        int length1=0;
        ListNode cur=headA;
        ListNode cur1=headB;
        if(headA==null||headB==null){
            return null;
        }
        while(cur!=null){
            cur=cur.next;
            length++;
        }
        while(cur1!=null){
            cur1=cur1.next;
            length1++;
        }
        //这个地方一定要指回来
        cur=headA;
        cur1=headB;

        //为了让两个指针能走相同步数找到公共节点
        while(length>length1){
            cur=cur.next;
            length1++;
        }
        while(length<length1){
            cur1=cur1.next;
            length++;
        }
        //开始寻找公共节点
        while(cur!=cur1){
            cur=cur.next;
            cur1=cur1.next;
        }
        //返回第一个公共节点
        return cur;
    }
}
