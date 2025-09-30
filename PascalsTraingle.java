import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // first row

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // first element always 1

            for (int j = 1; j < row.size(); j++) {
                newRow.add(row.get(j - 1) + row.get(j));
            }

            newRow.add(1); // last element always 1
            row = newRow;
        }

        return row;
    }
}
