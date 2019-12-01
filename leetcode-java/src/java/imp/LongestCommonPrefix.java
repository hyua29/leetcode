package java.imp;

public class LongestCommonPrefix {
    public String solution(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int minLength = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("")) return "";
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].substring(0, minLength).equals(strs[0].substring(0, minLength)) != true) minLength--;
            ;
            if (minLength < 0) return "";
        }
        return strs[0].substring(0, minLength);
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String[] array = new String[]{"acb", "aba", "esd"};

        String result = longestCommonPrefix.solution(array);

        System.out.println(result);
    }
}
