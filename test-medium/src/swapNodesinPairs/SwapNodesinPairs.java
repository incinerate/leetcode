package swapNodesinPairs;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * For example, Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * Your algorithm should use only constant space. You may not modify the values
 * in the list, only nodes itself can be changed.
 * 
 * @author Cun Shi
 *
 */
public class SwapNodesinPairs {

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode node = head.next;
		head.next = swapPairs(head.next.next);
		node.next = head;

		return node;

	}
}
