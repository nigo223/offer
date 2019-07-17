package q6;

/*
    从尾到头反过来打印出每个结点的值。

    输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。

*/

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

class Test {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(0);
        al.add(0);
        al.add(0);

        al.add(0, 1);
        al.add(3, 1);
        System.out.println(al);
    }
}

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<>();
        }

        ArrayList<Integer> al = new ArrayList<>();

        int len = 0;
        ListNode ln = listNode;
        while (ln != null) {
            len++;
            al.add(0);
            ln = ln.next;
        }

        ln = listNode;
        while (ln != null) {
            al.set(--len, ln.val);
            ln = ln.next;
        }

        return al;
    }
}
