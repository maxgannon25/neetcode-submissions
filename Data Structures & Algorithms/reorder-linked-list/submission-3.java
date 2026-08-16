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
      public void reorderList(ListNode head) {
       // YOUR LOGIC HERE
        
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (mid != null){
            ListNode nxt = mid.next;
            mid.next = prev;
            prev = mid;
            mid = nxt;
        }

        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            ListNode nextFirst = first.next;
            ListNode nextSecond = second.next;

            first.next = second;
            second.next = nextFirst;

            first = nextFirst;
            second = nextSecond;
        }
      }
}
