package java.imp;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> solution(String[] strs) {
        List<List<String>> results = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedChar = new String(charArray);

            if (map.containsKey(sortedChar)) {
                map.get(sortedChar).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);

                results.add(strList);
                map.put(sortedChar, strList);
            }
        }

        return results;
    }
}
