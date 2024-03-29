package q10_2;

/*
    我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
    请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

*/
public class Solution {
    private static int[] FibonacciMap = new int[]{
            0, 1, 2, 3, 5, 8,
            13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597,
            2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025,
            121393, 196418, 317811, 514229, 832040, 1346269, 2178309,
            3524578, 5702887, 9227465, 14930352, 24157817, 39088169,
            63245986, 102334155, 165580141
    };

    public int RectCover(int target) {
        return FibonacciMap[target];
    }
}
