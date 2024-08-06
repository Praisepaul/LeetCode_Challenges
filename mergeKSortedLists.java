/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0 || lists == null) {
            return null;
        }
        return mergeKListsHelper(lists, 0, lists.length - 1);
    }
    static ListNode mergeKListsHelper(ListNode[] lists, int start, int end){
        if(start == end){
            return lists[start];
        }
        if(start + 1 == end){
            return mergeLL(lists[start], lists[end]);
        }
        int mid = start + (end - start) / 2;
        ListNode left = mergeKListsHelper(lists, start, mid);
        ListNode right = mergeKListsHelper(lists, mid + 1, end);
        return mergeLL(left, right);
    }

    static ListNode mergeLL(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                curr.next = head1;
                head1 = head1.next;
            }
            else{
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        curr.next = (head1 != null) ? head1 : head2;
        return dummy.next;
    }
}