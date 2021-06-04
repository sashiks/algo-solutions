package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {

    public static void main(String... args) {
        ValidParanthesis obj = new ValidParanthesis();
      //  System.out.println(obj.isValid("()"));
        System.out.println(obj.isValid(")"));
        System.out.println(obj.isValid("("));
        System.out.println(obj.isValid("()"));
        System.out.println(obj.isValid("({)"));
        System.out.println(obj.isValid("({})"));
        System.out.println(obj.isValid("({)}"));
    }
    public boolean isValid(String s) {
        Map<Character, Character> pair = new HashMap<>();
        pair.put(')' , '(');
        pair.put('}' , '{');
        pair.put(']' , '[');
        Stack<Character> charStack = new Stack<>();
        for(int i =0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(!pair.containsKey(c)) {
                charStack.push(c);
            } else {
                if(charStack.isEmpty()) {
                    return false;
                }
                if(charStack.pop() != pair.get(c)) {
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }
}
