package leetcode;

public class MaxSubSeqPalindrome {

    public String longestPalindrome(String s) {
        if(s.length() == 1) {
            return s;
        }
        String longestPalindrome = s.substring(0,1);
        for(int i = 0; i < s.length()  ; i++) {
             int j = i;
             int k = checkRepetitions(s, i);
            if(k-j > longestPalindrome.length()){
                longestPalindrome = s.substring(j, k);
            }
              for(; j>=0 && k<s.length() ; j--, k++) {
                if(s.charAt(j) == s.charAt(k)) {
                    if(k-j >= longestPalindrome.length()){
                        longestPalindrome = s.substring(j, k+1);
                    }
                } else {
                    break;
                }
              }
        }

        return longestPalindrome;
    }

    private int checkRepetitions(String s, int i) {
        char c = s.charAt(i);
        int a = i;
        for(; a < s.length(); a++) {
            if(s.charAt(a) != c) {
                break;
            }
        }
        return --a;
    }


    public static void main(String... main) {
        System.out.println(new MaxSubSeqPalindrome().longestPalindrome("dabad"));
    }
}
