class Solution {

    public int regionsBySlashes(String[] grid) {

        int n = grid.length;
        int size = n * 3;
        int[][] arr = new int[size][size];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i].charAt(j) == '/') {
                    arr[i * 3][j * 3 + 2] = 1;
                    arr[i * 3 + 1][j * 3 + 1] = 1;
                    arr[i * 3 + 2][j * 3] = 1;
                }

                else if (grid[i].charAt(j) == '\\') {
                    arr[i * 3][j * 3] = 1;
                    arr[i * 3 + 1][j * 3 + 1] = 1;
                    arr[i * 3 + 2][j * 3 + 2] = 1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (arr[i][j] == 0) {
                    count++;
                    dfs(arr, i, j, size);
                }
            }
        }

        return count;
    }
    public void dfs(int[][] arr, int i, int j, int size) {

        if (i < 0 || j < 0 || i >= size || j >= size || arr[i][j] == 1) {
            return;
        }
        arr[i][j] = 1;

        dfs(arr, i + 1, j, size);
        dfs(arr, i - 1, j, size);
        dfs(arr, i, j + 1, size);
        dfs(arr, i, j - 1, size);
    }
}