package LinkedList;

    public class ListNode{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 
class Solution {
    public void reorderList(ListNode head) { // T(c) == O(n+n/2+n/2) == O(2n)
        if(head == null || head.next == null) return;

        ListNode mid = getMidNode(head); // O(n)
        ListNode nHead = mid.next; // O(1)
        mid.next = null; // O(1)
        nHead = reverseLL(nHead);// O(n/2)
        ListNode c1 = head; //O(1)
        ListNode c2 = nHead; //O(1)
        while(c2 != null){ // O(n/2)
          ListNode f1 = c1.next, f2 = c2.next;
          c1.next = c2;
          c2.next = f1;
          c1 = f1;
          c2 = f2;
        }
    }

    public static ListNode getMidNode(ListNode head){
      ListNode fast = head;
      ListNode slow = head;
      while(fast.next != null || fast.next.next != null){
        fast = fast.next.next;
        slow = slow.next;
      }
      return slow;
    }
    public static ListNode reverseLL(ListNode head){
      if(head == null || head.next == null) return head;

      ListNode prev = null;
      ListNode curr = head;
      while(curr != null){
        ListNode forw = curr.next;
        curr.next = prev;
        prev = curr;
        curr = forw;
      }
      return prev;
    }
    
}