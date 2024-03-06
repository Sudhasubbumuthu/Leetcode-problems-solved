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
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head != null){
            sb.append(head.val);
            head = head.next;
        }
        int sum = 0;
        sb.reverse();
        for(int i = sb.length()-1; i >= 0; i--){
            sum += ((sb.charAt(i)-'0')*(Math.pow(2,i)));
        }
        return sum;
    }
}