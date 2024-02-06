
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution141 {


    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        if (first == null)
            return false;
        ListNode second = head.next;

        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
            if (second == first) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
