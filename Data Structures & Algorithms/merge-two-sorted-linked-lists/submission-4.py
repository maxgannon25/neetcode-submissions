# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:

        c1 = list1
        c2 = list2

        dummy = ListNode(0)
        cur = dummy

        while c1 or c2:
            if c1 and c2:
                if c1.val <= c2.val:
                    cur.next = c1
                    c1 = c1.next
                else:
                    cur.next = c2
                    c2 = c2.next
            elif c1 and not c2:
                cur.next = c1
                c1 = c1.next
            elif c2 and not c1:
                cur.next = c2
                c2 = c2.next
            cur = cur.next

        return dummy.next



        