package q32_3;

/*
    请实现一个函数按照之字形打印二叉树，
    即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。

    

*/

import java.util.ArrayList;
import java.util.Collections;
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
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean reverse = false;

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

            if (reverse) {
                Collections.reverse(al);
            }
            reverse = !reverse;
            ans.add(al);
        }
        return ans;
    }
}
