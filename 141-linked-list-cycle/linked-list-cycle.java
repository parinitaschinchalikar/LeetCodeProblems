/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public boolean hasCycle(ListNode head) 
    {
        //Using HashSet
        // HashSet<ListNode> set = new HashSet<>();

        // while(head != null)
        // {
        //     if(set.contains(head))
        //     {
        //         return true;
        //     }
        //     set.add(head);
        //     head = head.next;
        // }
        // return false;

        //Using Floyd's Cycle finding algorithm
        ListNode slow = head, fast = head;

        while(slow != null && fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }
        return false;
    }
}