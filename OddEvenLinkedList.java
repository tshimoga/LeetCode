/** 
Question:
Given a singly linked list, group all odd nodes together followed by the even nodes. 
Please note here we are talking about the node number and not the value in the nodes.
You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null) {
            return null;
        } else if(head.next==null) {
            return head;
        }
        ListNode startOfEven = head.next;
        ListNode oddTemp = head;
        ListNode evenTemp = head.next;

        while(oddTemp.next!=null && evenTemp.next!=null) {
            oddTemp.next = evenTemp.next;
            evenTemp.next = oddTemp.next.next;
            
            oddTemp = oddTemp.next;
            evenTemp = evenTemp.next;
        }
        
        oddTemp.next = startOfEven; 
        return head;
        
    }
}
