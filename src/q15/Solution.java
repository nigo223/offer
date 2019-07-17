package q15;

/*
    输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

    分析：把一个整数减去1再和原来的数做位与，就得到了该数二进制中的一个1，这样的效率是最高的

*/
public class Solution {
    public int NumberOf1(int n) {
        int ans = 0;
        while (n != 0) {
            int m = n - 1;
            n = n & m;
            ans++;
        }
        return ans;
    }
}
