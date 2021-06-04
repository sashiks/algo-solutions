package leetcode;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int max = 0;
        int runner = 0;
        for(int i = 0; i < s.length()-1 ; i++) {
            if('(' == s.charAt(i)) {
                runner = 1;
                int j = i + 1;
                for (; j < s.length(); j++) {
                    if('(' == s.charAt(j)) {
                        runner++;
                    } else {
                        runner--;
                    }
                    if(runner == 0) {
                        if( j+1 - i > max) {
                            max = j+1 - i ;
                        }
                    }
                    if(runner < 0) {
                        break;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String... args) {
        LongestValidParentheses obj = new LongestValidParentheses();
        int tno = 0;
        System.out.println(++tno + " : " + obj.longestValidParentheses("")); //1
        System.out.println(++tno + " : " + obj.longestValidParentheses("("));//2
        System.out.println(++tno + " : " + obj.longestValidParentheses(")"));//3
        System.out.println(++tno + " : " + obj.longestValidParentheses("()"));//4
        System.out.println(++tno + " : " + obj.longestValidParentheses("())"));//5
        System.out.println(++tno + " : " + obj.longestValidParentheses("(()"));//6
        System.out.println(++tno + " : " + obj.longestValidParentheses("(())"));//7
        System.out.println(++tno + " : " + obj.longestValidParentheses("()()"));//8
        System.out.println(++tno + " : " + obj.longestValidParentheses("()(()"));//9

    }
}
