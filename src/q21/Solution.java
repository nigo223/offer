package q21;

import java.util.ArrayList;
import java.util.Arrays;

/*
    输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
    使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
    并保证奇数和奇数，偶数和偶数之间的相对位置不变。

*/


public class Solution {
    public void reOrderArray(int[] array) {
        int oddCnt = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                oddCnt++;
            }
        }
        int[] clone = array.clone();
        int i = 0;
        int j = oddCnt;

        for (int num : clone) {
            if (num % 2 == 1) {
                array[i++] = num;
            } else {
                array[j++] = num;
            }
        }
    }
}
