package q32_1;

/*
    题目描述
    从上往下打印出二叉树的每个节点，同层节点从左至右打印。
    分析：层序遍历，用一个队列记录，每个节点出队的时候看它有没有左右孩子，
        有的话就左右孩子进队

*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root); // 根节点入队
        while (!queue.isEmpty()) { // 队列非空
            TreeNode p = queue.poll();
            ans.add(p.val);
            if (p.left != null) {
                queue.add(p.left);
            }
            if (p.right != null) {
                queue.add(p.right);
            }
        }
        return ans;
    }
}
