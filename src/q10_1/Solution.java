package q10_1;

/*
    大家都知道斐波那契数列，
    现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
    n<=39

*/
class Test {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = a + b;
        for (int i = 0; i < 40; i++) {
            c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
    }
}

public class Solution {
    private static int[] FibonacciMap = new int[]{0, 1, 1, 2, 3, 5, 8,
            13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597,
            2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025,
            121393, 196418, 317811, 514229, 832040, 1346269, 2178309,
            3524578, 5702887, 9227465, 14930352, 24157817, 39088169,
            63245986, 102334155, 165580141
    };

    public int Fibonacci(int n) {
        return FibonacciMap[n];
    }
}
