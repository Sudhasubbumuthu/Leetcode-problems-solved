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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode cur = list1; //to find the a and b th position
        int i = 0;
        while(i < a-1){
            cur = cur.next;
            i++;
        }
        ListNode front = cur;
        while(i < b+1){
            cur = cur.next;
            i++;
        }
        ListNode rear = cur;
        ListNode secTail = list2, secHead = list2;
        while(secTail.next != null){
            secTail = secTail.next;
        }
        front.next = secHead;
        secTail.next = rear;
        return list1;
    }
}