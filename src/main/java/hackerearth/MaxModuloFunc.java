package hackerearth;

import java.math.BigInteger;
import java.util.Scanner;

public class MaxModuloFunc {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int tc = Integer.parseInt(s.nextLine());
        for(int i = 0; i< tc ; i++) {
            String[] p = s.nextLine().split(" ");
            int inpLen = Integer.parseInt(p[0]);
            String quotientStr = p[1];
            long quotient = Long.parseLong(quotientStr);
            StringBuilder numStr = new StringBuilder(s.nextLine());
            long remainder = -1;
            if(inpLen > 100 ) {

            }
            for (int j = 0; j < inpLen; j++) {
                StringBuilder num = new StringBuilder(numStr);
                num = num.deleteCharAt(j);
                if(num.length() > 0) {
                    remainder = Math.max(remainder, getRemainder(num.toString(), quotient));
                }
            }
            System.out.println(getRemainder(numStr.toString(), quotient));
        }
    }
    static BigInteger getRemainder(String s, BigInteger quotient) {
        BigInteger b = new BigInteger(s.toString());
        return b.mod(quotient);
    }
    static long getRemainder(String s, long quotient) {
        long num = 0;
        for(int i=0; i < s.length(); i++) {
            num = num *10;
            int x = Character.getNumericValue(s.charAt(i));
            num = num + x;
            num %= quotient;
        }
        return num;
    }
}
