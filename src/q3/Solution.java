package q3;

/*
    在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
    数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。
    请找出数组中任意一个重复的数字。

    *要求时间复杂度O[n]，空间复杂度O[1]

    Input:
    {2, 3, 1, 0, 2, 5}

    Output:
    2

    分析：用交换的思路

*/

public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false

    public boolean duplicate(int[] numbers, int length, int[] duplication) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }

        for (int i = 0; i < length;) {
            int number = numbers[i];
            if (number == i) { // 当前数字和序号相等，不需要交换
                i++;
            } else if (numbers[number] == number) { // 不相等，但是在number位置上已经有number了，证明number重复
                duplication[0] = number;
                return true;
            } else { // 不等，且可以交换
                int temp = numbers[i];
                numbers[i] = numbers[number];
                numbers[number] = number;
            }
        }
        return false;
    }
}
