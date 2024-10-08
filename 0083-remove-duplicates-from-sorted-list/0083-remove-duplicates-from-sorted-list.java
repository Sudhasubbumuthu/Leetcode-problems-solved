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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        HashSet<Integer> mp = new HashSet<>();
        mp.add(head.val);
        ListNode cur = head,prev = head;
        while(cur != null){
            if(mp.contains(cur.val)){
                prev.next = cur.next;
            }
            else{
                mp.add(cur.val);
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}