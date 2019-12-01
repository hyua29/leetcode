package java.imp;

import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        int maxSubString = 0;
        for (int i=0;i<s.length();i++) {
            int subStringLength = this.aux(s.substring(i, s.length()));
            if (subStringLength > maxSubString) {
                maxSubString = subStringLength;
            }
        }
        return maxSubString;
    }

    private int aux(String s) {
        Set<Character> store = new HashSet<>();
        char[] charArray = s.toCharArray();
        int pointer = 0;
        for (char c : charArray) {
            if (store.contains(c)) {
                break;
            }
            store.add(c);
            pointer++;
        }
        return pointer;
    }
}