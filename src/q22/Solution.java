package q22;

/*
    输入一个链表，输出该链表中倒数第k个结点。

    分析：
        不用知道链表的长度，用双指针法即可

*/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }

        ListNode p = head;
        ListNode q = head;

        for (int i = 0; i < k - 1; i++) {
            q = q.next;
            if (q == null) {
                return null; // 如果q为null，说明长度不够，直接返回null
            }
        }

        while (q.next != null) {
            q = q.next;
            p = p.next;
        }

        return p;
    }
}
