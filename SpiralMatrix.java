class Solution {
    public int[][] generateMatrix(int n) {
       int[][] a = new int[n][n];
        if(n == 1) {
            a[0][0] = 1;
            return a;
        }
        else {
            for(int i = 0; i < n; i++) {
                a[0][i] = i + 1;
                a[n - 1][n - 1 - i] = n * 2 - 1 + i;
            }
            for(int i = 1; i < n - 1; i++) {
                a[i][n - 1] = n + i;
                a[n - 1 - i][0] = n + i + (2 * n - 2);
            }
            if (n > 2) {
                int[][] temp = generateMatrix(n - 2);
                for (int i = 1; i < n - 1; i++) {
                    for(int j = 1; j < n - 1; j++) {
                        if(n % 2 == 0) {
                            a[i][j] = temp[i - 1][j - 1] + 4 * (n - 1);
                        }
                        else {
                            a[i][j] = temp[i - 1][j - 1] + n / 2 * 8;
                        }
                    }
                }
            }
        }
        return a;
    }
}