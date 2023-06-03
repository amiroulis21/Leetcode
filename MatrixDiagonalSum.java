class Solution {
    public int diagonalSum(int[][] mat) {
        int primSum = 0;
        for(int i = 0; i < mat.length; i++) {
            primSum += mat[i][i];
            if (mat.length - 1 - i != i) {
                primSum += mat[i][mat.length - 1 - i];
            }
        }
        return primSum;
        
    }
}