package q11;

/*
    把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
    输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。

    分析：
        采用二分查找法

*/
public class Solution {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int l = 0, h = array.length - 1;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (array[m] == array[l] && array[m] == array[h]) { // 特殊情况，不知道最小值在哪个区间，就采用顺序查找
                return minNumber(array, l, h);
            } else if (array[m] <= array[h]) {
                h = m;
            } else {
                l = m + 1;
            }
        }
        return array[l];
    }

    private int minNumber(int[] array, int l, int h) {
        for (int i = l; i < h; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return array[l];
    }
}
