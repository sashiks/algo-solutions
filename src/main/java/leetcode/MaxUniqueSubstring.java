package leetcode;

import java.util.HashSet;
import java.util.Set;

public class MaxUniqueSubstring {
    public int lengthOfLongestSubstring(String s) {

        //if(s.isEmpty()) return 0;
        Set<Character> set = null;
        int maxCount = 0;
        int p1 = 0;
        int p2 = 1;
        for(; p1 < s.length()-1 ; p1++) {
            set = new HashSet<>();
            for(p2 = p1; p2 < s.length() ; p2++) {
                if(set.contains(s.charAt(p2))) {
                    break;
                }
                set.add(s.charAt(p2));
            }
            maxCount = Math.max(set.size(), maxCount);
        }

        return maxCount;
    }
}
