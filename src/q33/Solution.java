package q33;

/*
    输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
    如果是则输出Yes,否则输出No。
    假设输入的数组的任意两个数字都互不相同。

*/
public class Solution {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return isSequenceOfBST(sequence, 0, sequence.length - 1);
    }

    private boolean isSequenceOfBST(int[] seq, int start, int end) {
        if (start >= end) { // 递归出口
            return true;
        }

        int partition = seq[end];

        int i = start;
        while (seq[i] < partition) {
            i++;
        }
        int partitionIndex = i;
        while (seq[i] > partition) {
            i++;
        }
        if (i != end) {
            return false;
        } else {
            return isSequenceOfBST(seq, start, partitionIndex - 1)
                    && isSequenceOfBST(seq, partitionIndex, end - 1);
        }
    }
}
