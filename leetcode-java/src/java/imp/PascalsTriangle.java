package java.imp;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0;i<numRows;i++) {
            List<Integer> rowResult = new ArrayList<>(i+1);
            for (int j=0;j<i+1;j++) {
                if (j == 0) rowResult.add(1);
                else if (j == i) rowResult.add(1);
                else {
                    List<Integer> upperRow = result.get(i - 1);
                    int left = upperRow.get(j - 1);
                    int right = upperRow.get(j);
                    rowResult.add(left + right);
                }

            }
            result.add(rowResult);
        }
        return result;
    }
}
