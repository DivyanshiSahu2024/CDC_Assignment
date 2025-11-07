// Problem Link: https://leetcode.com/problems/add-two-numbers/description/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
  // Create a dummy node to simplify the result list construction
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        int carry=0;
   // Traverse both linked lists
        while (l1 != null || l2 != null) {
            int sum = carry; // Start with the carry

            // Add the value from l1 if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // Move to the next node
            }
             // Add the value from l2 if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // Move to the next node
            }
              // Update carry for the next iteration
            carry = sum / 10;
             // Create a new node with the digit value (sum % 10)
            current.next = new ListNode(sum % 10);
            current = current.next; // Move to the next node in the result
        }
        
        // If there's a carry left, add a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the next node of dummyHead, which is the head of the result list
        return dummy.next;
    }

    // Helper function to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}
