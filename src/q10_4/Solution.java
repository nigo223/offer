package q10_4;

/*
    一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
    求该青蛙跳上一个n级的台阶总共有多少种跳法。

*/
public class Solution {
    private int[] fib = new int[30];

    public Solution() {
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            for (int j = 0; j < i; j++) {
                fib[i] += fib[j];
            }
        }
    }

    public int JumpFloorII(int target) {
        return fib[target];
    }
}
