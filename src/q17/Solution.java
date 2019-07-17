package q17;
/*
    输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
    比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999。

*/
class Test {
    public static void main(String[] args) {
        new Solution().printNumber(3);

    }
}

public class Solution {
    public void printNumber(int n) {
        if (n <= 0) {
            throw new RuntimeException("Illegal n!");
        }

        int[] bigInteger = new int[n];
        bigInteger[n - 1] = 1;
        int p = n - 1;
        while (true) {
            printArray(bigInteger);
            System.out.println();
            while (bigInteger[p] == 9) {
                bigInteger[p] = 0;
                p--;
                if (p < 0) { // 已经到最大值了
                    return; // 循环出口
                }
            }
            bigInteger[p]++;
            p = n - 1;
        }
    }

    private void printArray(int[] nums) {
        boolean flag = false; // 判断前导的0是否已经结束
        for (int num : nums) {
            if (flag || num != 0) { // 前导的0已经结束，或者num不是0
                flag = true;
                System.out.print(num);
            }
        }
    }

}
