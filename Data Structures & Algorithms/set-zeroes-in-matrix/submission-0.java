class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j] == 0){
                    set.add(i + " th row Zero");
                    set.add(j + " th column Zero");
                }

            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(set.contains(i + " th row Zero") || set.contains(j + " th column Zero")){
                    matrix[i][j] = 0;
                }
            }
            
        }
        return;

        
    }
}
