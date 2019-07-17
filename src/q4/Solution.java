package q4;

/*
    给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。
    给定一个数，判断这个数是否在该二维数组中。

    Consider the following matrix:
    [
      [1,   4,  7, 11, 15],
      [2,   5,  8, 12, 19],
      [3,   6,  9, 16, 22],
      [10, 13, 14, 17, 24],
      [18, 21, 23, 26, 30]
    ]

    Given target = 5, return true.
    Given target = 20, return false.

    要求时间复杂度 O(M + N)，空间复杂度 O(1)。其中 M 为行数，N 为 列数。

    分析：
        不用两次二分查找。
        观察可得，从右上角开始，target比当前小就左移，比当前大就下移即可。

*/
public class Solution {
    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }

        int m = array.length; // m行n列
        int n = array[0].length;

        for (int i = 0, j = n - 1; i < m && j >= 0; ) {
            if (target == array[i][j]) {
                return true;
            } else if (target < array[i][j]) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}
