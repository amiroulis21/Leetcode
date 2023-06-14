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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode();
        int carry = 0;
        if(l1 == null && l2 == null) {
            return null;
        }
      else if(l1 == null) {
            return l2;
        }
        else if(l2 == null) {
            return l1;
        }
        else {
            sum.val = l1.val + l2.val;
            if (sum.val >= 10) {
                sum.val -= 10;
                carry = 1;
            }
            sum.next = addTwoNumbers(l1.next, l2.next);
            if(sum.next != null || carry != 0) {
            sum.next = addTwoNumbers(sum.next, new ListNode(carry));
            }
        }
        return sum;
    }
}