package java.imp;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> solution(int numPairs) {
        List<String> result = new ArrayList<>();
        this.directedGenerateBalancedParentheses(numPairs, numPairs, "", result); // kick off the recursion
        return result;
    }

    private void directedGenerateBalancedParentheses(int numLeftParensNeeded, int numRightParensNeeded, String parenStringInProgress, List<String> result) {
        if (numLeftParensNeeded == 0 && numRightParensNeeded == 0) {
            result.add(parenStringInProgress);
            return;
        }
        if (numLeftParensNeeded > 0) {

    /*
      numLeftParensNeeded - 1 ->       We are using a left paren
      numRightParensNeeded ->          We did not use a right paren
      parenStringInProgress + "(" ->   We append a left paren to the string in progress
      result ->                        Just pass the result list along for the next call to use
    */
            this.directedGenerateBalancedParentheses(numLeftParensNeeded - 1, numRightParensNeeded,
                    parenStringInProgress + "(", result);
        }
        if (numLeftParensNeeded < numRightParensNeeded) {

    /*
      numLeftParensNeeded ->           We did not use a left paren
      numRightParensNeeded - 1 ->      We used a right paren
      parenStringInProgress + ")" ->   We append a right paren to the string in progress
      result ->                        Just pass the result list along for the next call to use
    */
            this.directedGenerateBalancedParentheses(numLeftParensNeeded, numRightParensNeeded - 1,
                    parenStringInProgress + ")", result);
        }
    }

}
