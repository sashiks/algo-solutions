package leetcode;

public class FibFrom0 {
    public static void main(String[] main) {
        System.out.println(fib(10));
    }
    public static int fib(int n) {
        if(n < 3) {
            return 1;
        }
        int prev1 = 0;
        int prev2 = 1;
        for(int i = 2; i <= n ; i++) {
            int t = prev2;
            prev2 = prev1+prev2;
            prev1 = t;
        }
        return prev2;
    }
}
