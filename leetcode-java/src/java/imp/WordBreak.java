package java.imp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);

        int start = 0;
        for (int i=1;i<=s.length();i++) {
            String sub = s.substring(start, i);
            if (set.contains(sub)) start = i;
        }

        return start == s.length();
    }

    public static void main(String[] args) {
        String s = "aaaaaaa";
        WordBreak wordBreak = new WordBreak();
        System.out.println(wordBreak.wordBreak(s, Arrays.asList("aaaa", "aaa")));
    }
}
