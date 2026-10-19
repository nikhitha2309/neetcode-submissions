class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowStart = 0;
        int rowEnd = matrix.length-1;
        

        while(rowStart<= rowEnd ){
            int midRow = (rowStart+ rowEnd)/2;

            if(matrix[midRow][0] <= target && matrix[midRow][matrix[midRow].length-1] >= target){
                int columnStart = 0;
        int columnEnd = matrix[0].length-1;
                while(columnStart<= columnEnd){
                    int midColumn = (columnEnd+columnStart)/2;
                    if(matrix[midRow][midColumn] == target){
                        return true;
                    } else if (matrix[midRow][midColumn] < target) {
                        columnStart = midColumn+1;

                    }else {
                        columnEnd = midColumn-1;
                    }
                }
                return false;

            } else if (matrix[midRow][0]>target) {
                rowEnd = midRow-1;

            }else{
                rowStart = midRow+1;
            }
        }
        return false;
        
    }
}
