class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        
        while (curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        
        return prev;
    }
}