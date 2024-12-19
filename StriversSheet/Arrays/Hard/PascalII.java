package StriversSheet.Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

public class PascalII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // The first element is always 1

        for (int k = 1; k <= rowIndex; k++) {
            long value = (long) row.get(k - 1) * (rowIndex - k + 1) / k;
            row.add((int) value);
        }
        return row;
    }
}
   //O(1) ->space complexity
//n=4=>1 4 6 4 1