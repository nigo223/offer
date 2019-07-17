package q18_1;
/*
    给定单向链表的头指针和结点指针。在 O(1) 时间内删除链表节点

    分析：如果不是尾节点，那么可以采用将该节点后面的节点值赋值给该节点，再把该节点指针指向下下个节点
        如果是尾节点，那么需要遍历

*/
class ListNode{
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }
}

public class Solution {
    ListNode deleteNode(ListNode head, ListNode toBeDeleted) {
        if (head == null || toBeDeleted == null) {
            throw new NullPointerException();
        }
        if (head == toBeDeleted) { // 只有一个节点
            head = null; // 直接将头节点赋值为null
        }

        if (toBeDeleted.next == null) { // 是尾节点，那么遍历链表
            ListNode p = head;
            while (p.next != toBeDeleted) {
                p = p.next;
            }
            p.next = null;
        } else { // 要删除的不是尾节点
            toBeDeleted.value = toBeDeleted.next.value;
            toBeDeleted.next = toBeDeleted.next.next;
        }
        return head;
    }
}
