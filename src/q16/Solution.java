package q16;

/*
    给定一个double类型的浮点数base和int类型的整数exponent。
    求base的exponent次方。

*/
public class Solution {
    public double Power(double base, int exponent) {
        if (base == 0 && exponent < 0) { // 浮点数是0，指数是负数，则除以0异常
            throw new RuntimeException("分母为0");
        }

        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        boolean isNegative = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegative = true;
        }
        double pow = Power(base * base, exponent / 2);
        if (exponent % 2 != 0) {
            pow = pow * base;
        }
        return isNegative ? 1 / pow : pow;
    }
}
