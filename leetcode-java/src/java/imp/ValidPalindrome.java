package java.imp;

import utils.ListNode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^\\w]","").toLowerCase();

        int low = 0, high = s.length() - 1;

        while (low < high) {

            if (!s.substring(low, low + 1).equals(s.substring(high, high + 1))) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("OP"));
    }

}
