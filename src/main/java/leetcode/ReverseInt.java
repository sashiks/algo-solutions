package leetcode;

public class ReverseInt {
    /*public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if(x<0) {
            sb.append("-");
            x = x*(-1);
        }
        String s = Integer.toString(x);
        for(int i = s.length()-1; i>=0; i--) {
            sb.append(s.charAt(i));
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch(NumberFormatException e) {
            return 0;
        }
    }*/
    public int reverse(int x) {
        int num = x;
        long reversed = 0;
        while(num != 0) {
            int digit = num%10;
            {
                reversed = reversed * 10 + digit;
                if(reversed > Integer.MAX_VALUE) {
                    return 0;
                } else if(reversed < Integer.MIN_VALUE) {
                    return 0;
                }
            }
            num = num/10;
        }
        return (int)reversed;

    }
    public static void main(String... args) {
        System.out.println(new ReverseInt().reverse(-2147483412));
    }
}
