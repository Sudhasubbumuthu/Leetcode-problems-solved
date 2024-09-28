/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode cur = head, prev = null;
        while(cur != null){
            int pro = cur.val * 2;
            if(pro > 9 && cur == head){
                if(pro > 9){
                    ListNode newnode = new ListNode(1);
                    newnode.next = cur;
                    head = newnode;
                }
                cur.val = pro % 10;
            }
            else{
                if(pro > 9){
                    prev.val += 1;
                }
                cur.val = pro % 10;
            }
            prev = cur;
            cur = cur.next;
        }
        return head;
    }
}