package leetcode;

import java.util.HashSet;
import java.util.Set;

public class StringPanagram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> charSet = new HashSet<>();
        for(int i = 0; i< sentence.length() ; i++) {
            char c = sentence.charAt(i);
            if(Character.isLowerCase(c)) {
                if(!charSet.contains(c)) {
                    charSet.add(c);
                    if(charSet.size() == 26) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}