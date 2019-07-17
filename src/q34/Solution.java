package q34;

/*
    输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
    路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
    (注意: 在返回值的list中，数组长度大的数组靠前)

*/

import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    private ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    private Stack<Integer> path = new Stack<>();
    private int currentSum = 0;

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return ans;
        }
        findPath(root, target);
        return ans;
    }

    private void findPath(TreeNode root, int target) {
        currentSum += root.val;
        path.push(root.val);
        
        // 如果是叶节点，且路径上节点的和等于输入的值
        // 添加该路径
        if (currentSum == target && (root.left == null && root.right == null)) {
            ArrayList<Integer> al = new ArrayList<>(path);
            ans.add(al);
        }
        
        // 如果不是叶节点，遍历子节点
        if (root.left != null) {
            FindPath(root.left, target);
        }
        if (root.right != null) {
            FindPath(root.right, target);
        }

        // 返回父节点之前，删除当前节点
        // 并在currentSum中减去当前结点的值
        currentSum -= root.val;
        path.pop();
    }
}
