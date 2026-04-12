class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        Set<Integer> col = new HashSet<>();
        Set<Integer> diag = new HashSet<>();
        Set<Integer> antiDiag = new HashSet<>();
        char[][] board = new char[n][n];

        for (char[] row : board) Arrays.fill(row, '.');

        solve(0, n, board, col, diag, antiDiag, res);
        return res;
    }

    void solve(int r, int n, char[][] board, Set<Integer> col, Set<Integer> diag, Set<Integer> antiDiag, List<List<String>> res) {
        if (r == n) {
            List<String> temp = new ArrayList<>();
            for (char[] row : board) temp.add(new String(row));
            res.add(temp);
            return;
        }

        for (int c = 0; c < n; c++) {
            if (col.contains(c) || diag.contains(r - c) || antiDiag.contains(r + c)) continue;

            board[r][c] = 'Q';
            col.add(c);
            diag.add(r - c);
            antiDiag.add(r + c);

            solve(r + 1, n, board, col, diag, antiDiag, res);

            board[r][c] = '.';
            col.remove(c);
            diag.remove(r - c);
            antiDiag.remove(r + c);
        }
    }
}
