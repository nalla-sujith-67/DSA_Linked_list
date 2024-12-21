//the question is to place all the even indexes first and then the odd indexes next
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
    public ListNode oddEvenList(ListNode head) {

        if (head == null) return null;

        ListNode evenH = new ListNode(-1); 
        ListNode oddH = new ListNode(-1);  
        ListNode even = evenH; 
        ListNode odd = oddH;   

        ListNode current = head;
        int index = 0; 

      
        while (current != null) {
            if (index % 2 == 0) {
                even.next = current; 
                even = even.next;    
            } else {
                odd.next = current;  
                odd = odd.next;      
            }
            current = current.next; 
            index++;
        }

        
        even.next = oddH.next; 
        odd.next = null;       

        return evenH.next; 
    }
}
