package leetcode;

public class DivideInts {

    public static void main(String... args) {
        DivideInts obj = new DivideInts();
        System.out.println(obj.divide(-2147483648, 2));
    }
    public int divide(int dividend, int divisor) {
        int q = 0;
        if(dividend == 0)
            return 0;
        boolean negate = false;
        if(dividend < 0 && divisor < 0)
            negate = false;
        else if(dividend < 0 || divisor < 0)
            negate = true;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if(dividend < divisor)
            return 0;
        else if(divisor == 1)
            q = dividend;
        else {
            q = 1;
            int t = divisor;
            while (true) {
                if (t + t < dividend) {
                    q += q;
                    t += t;
                } else
                    break;
            }
            while (true) {
                if (t + divisor <= dividend) {
                    t += divisor;
                    q++;
                } else
                    break;
            }
        }
        return negate ? -q : q;
    }
}
