package java.imp;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i=0;i<haystack.length();i++) {
            char c = haystack.charAt(i);
            if (c == needle.charAt(0)) {
                boolean matchFound = true;
                for (int j=0;j<needle.length();j++) {
                    if (j + i >= haystack.length()) {
                        matchFound = false;
                        break;
                    }
                    if (needle.charAt(j) != haystack.charAt(j + i)) {
                        matchFound = false;
                    }
                }
                if (matchFound) return i;
            }
        }
        return -1;
    }
}
