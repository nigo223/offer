package q32_2;

/*
    从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。

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
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (pRoot == null) {
            return ans;
        }
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            ArrayList<Integer> al = new ArrayList<>();
            int size = queue.size();
            while (size-- != 0) {
                TreeNode p = queue.poll();
                al.add(p.val);
                if (p.left != null) {
                    queue.add(p.left);
                }
                if (p.right != null) {
                    queue.add(p.right);
                }
            }
            // 队列中的元素已经取完，要到下一行了
            ans.add(al);
        }
        return ans;
    }
}
