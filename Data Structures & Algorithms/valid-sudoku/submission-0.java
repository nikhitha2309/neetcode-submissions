class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowSet = new HashSet<>();
        Set<Character> columnSet = new HashSet<>();
        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if (rowSet.contains(board[i][j])) {
                        return false;
                    } else {
                        rowSet.add(board[i][j]);
                    }
                }
                if(board[j][i] != '.') {
                    if (columnSet.contains(board[j][i])) {
                        return false;
                    } else {
                        columnSet.add(board[j][i]);
                    }
                }

            }
            rowSet.clear();
            columnSet.clear();

        }

        Set<Character> matrixSet = new HashSet<>();
        for (int i = 0; i < 9; i=i+3) {
            for (int j = 0; j < 3; j++) {


                int row = i;
                int column = (j*3);
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if(board[row][column] != '.') {
                            if (matrixSet.contains(board[row][column])) {
                                return false;
                            } else {
                                matrixSet.add(board[row][column]);
                            }
                        }
                        column++;

                    }
                    column = (j*3);
                    row++;

                }
                matrixSet.clear();

            }
            
        }
        return true;
        
    }
}
