package java.imp;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String longest = "";
        for (int i=0;i<s.length();i++) {
            int right = i + 1;
            int left = i - 1;
            String temp = s.substring(i, i + 1);
            while (right < s.length() && s.charAt(i) == s.charAt(right)) {
                temp = temp + s.substring(right, right + 1);
                right++;
            }
            while (right < s.length() && left >= 0 && s.charAt(right) == s.charAt(left)) {
                temp = s.substring(left, left + 1) + temp + s.substring(right, right + 1);
                right++;
                left--;
            }
            if (temp.length() > longest.length()) longest = temp;
            temp = "";
        }
        return longest;
    }
}
