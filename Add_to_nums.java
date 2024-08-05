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
import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null; // Initialize res as null
        int carry = 0;
        ListNode current = null; // Initialize current as null
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            
            if (current == null) {
                res = new ListNode(sum % 10);
                current = res;
            } else {
                current.next = new ListNode(sum % 10);
                current = current.next;
            }

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return res;
    }
}
