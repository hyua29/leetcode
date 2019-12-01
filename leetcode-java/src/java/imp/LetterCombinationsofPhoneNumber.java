package java.imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsofPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        List<String> temp = new ArrayList<>();

        String first = map.get(digits.substring(0, 1));
        for (int i = 0; i < first.length(); i++) {
            temp.add(first.substring(i, i + 1));
        }

        List<String> results = temp;
        for (int i = 1; i < digits.length(); i++) {
            temp = new ArrayList<>();
            String s = map.get(digits.substring(i, i + 1));
            for (int j = 0; j < s.length(); j++) {
                for (String result : results) {
                    temp.add(result + s.substring(j, j + 1));
                }
            }
            results = temp;
        }

        return results;
    }

    public static void main(String[] args) {
        LetterCombinationsofPhoneNumber letterCombinationsofPhoneNumber = new LetterCombinationsofPhoneNumber();
        System.out.println(letterCombinationsofPhoneNumber.letterCombinations("23"));
    }

}
