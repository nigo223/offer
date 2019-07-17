package q29;

/*
    题目描述
    输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
    例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
    则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

    ps：矩阵行列可以不相等

*/

import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(new Solution().printMatrix(nums));

    }
}

public class Solution {
    private static final int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 顺时针方向

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (matrix.length == 0 || matrix[0].length == 0) {
            return ans;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];

        int i = 0, j = 0, d = 0;
        while (i >= 0 && i < m && j >= 0 && j < n && !visited[i][j]) {
            while (i >= 0 && i < m && j >= 0 && j < n && !visited[i][j]) {
                ans.add(matrix[i][j]);
                visited[i][j] = true;
                i += directions[d][0];
                j += directions[d][1];
            }
            // 撞车了，换个方向接着开
            i -= directions[d][0];
            j -= directions[d][1];
            d = (d + 1) % 4;
            i += directions[d][0];
            j += directions[d][1];
        }
        return ans;
    }
}
