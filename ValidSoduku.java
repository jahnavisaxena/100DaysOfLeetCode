public class Solution {
    public boolean isValidSudoku(char[][] board){
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.' || ch == '0') continue; 
                if (ch < '1' || ch > '9') return false;
                int b = (r / 3) * 3 + (c / 3);
                if (rows[r].contains(ch) || cols[c].contains(ch) || boxes[b].contains(ch))
                    return false;
                rows[r].add(ch);
                cols[c].add(ch);
                boxes[b].add(ch);
            }
        }
        return true;
    }
}
