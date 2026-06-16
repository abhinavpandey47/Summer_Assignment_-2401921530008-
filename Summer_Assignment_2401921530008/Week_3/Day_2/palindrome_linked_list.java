class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode s = head, f = head;
        
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        
        ListNode prev = null, curr = s;
        while (curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        
        ListNode l = head, r = prev;
        while (r != null) {
            if (l.val != r.val) return false;
            l = l.next;
            r = r.next;
        }
        
        return true;
    }
}