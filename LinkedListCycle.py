# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        rab = head
        tor = head
        while rab and rab.next:
            rab = rab.next.next
            tor = tor.next
            if rab == tor:
                return True
        return False