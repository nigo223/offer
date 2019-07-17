package q18_2;

/*
    在一个排序的链表中，存在重复的结点，
    请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    例如，链表1->2->3->3->4->4->5 处理后为 1->2->5

*/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }

        ListNode q = pHead.next;
        if (pHead.val == q.val) {
            while (q != null && pHead.val == q.val) {
                q = q.next;
            }
            return deleteDuplication(q);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}
