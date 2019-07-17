package q8;

/*
    给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
    注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。

    分析：
        1、如果当前结点有右子树，返回右子树上最左边的结点。
        2、如果当前结点没有右子树
            如果当前节点有父亲
                是左孩子，返回父结点
                右孩子，找到所有祖先中第一个是左孩子的节点的父节点。


*/
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }

        if (pNode.right != null) { // 有右子树
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left; // 找到右子树上最左边的节点
            }
            return pNode;
        } else if (pNode.next != null) { // 没有右子树,但是有父节点
            if (pNode.next.left == pNode) { // 是左孩子
                return pNode.next; // 返回父节点
            } else { // 是右孩子
                pNode = pNode.next;
                while (pNode.next != null && pNode != pNode.next.left) { // 当前节点有父节点，且不是左孩子
                    pNode = pNode.next;
                }
                return pNode.next;
            }
        } else { // 没有右子树，也没有父节点
            return null;
        }
    }
}
