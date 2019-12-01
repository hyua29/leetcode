package java.imp;

import java.util.ArrayList;
import java.util.List;

public class GenerateParathesis {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        this.helper(n,n, results, "");
        return results;
    }

    private void helper(int left, int right, List<String> results, String currentResult) {
        if (left == 0 && right == 0) {
            results.add(currentResult);
            return;
        }

        if (left > 0) {
            this.helper(left - 1, right, results, currentResult + "(");
        }

        if (right > left && right > 0) {
            this.helper(left, right - 1, results, currentResult + ")");
        }
    }

    public static void main(String[] args) {
        GenerateParathesis generateParathesis = new GenerateParathesis();
        System.out.println(generateParathesis.generateParenthesis(3));
    }
}
