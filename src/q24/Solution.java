package q24;

/*
    输入一个链表，反转链表后，输出新链表的表头。

    分析：
        用头插法来反转链表

*/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = head;
        ListNode q = p.next;

        while (q != null) {
            p.next = q.next;
            q.next = head;
            head = q;
            q = p.next;
        }

        return head;
    }
}
