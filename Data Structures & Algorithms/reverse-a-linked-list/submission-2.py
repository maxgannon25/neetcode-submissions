# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        cur = head

        while cur:
            nxt = cur.next      # Save next node
            cur.next = prev     # Reverse the link
            prev = cur          # Move prev forward
            cur = nxt           # Move current forward

        return prev
            
        