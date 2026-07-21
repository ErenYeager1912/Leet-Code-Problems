class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node acts as the starting anchor of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        // Traverse both lists and attach the smaller value
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        // Attach remaining nodes if any list is not fully traversed
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }
        return dummy.next;
    }
}
