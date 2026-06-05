class Solution {

    void dfs(char[][] grid, int[][] visited, int i, int j) {
        if (i >= grid.length || i < 0 || j < 0 || j >= grid[0].length) {
            return;
        }
        // System.out.println(i);
        if (visited[i][j] == 1) {
            return;
        }
        visited[i][j] = 1;
        if (grid[i][j] == '0') {
            visited[i][j] = 1;
            return;
        }
        // if()
        // visited[i][j]=1;

        dfs(grid, visited, i + 1, j);
        dfs(grid, visited, i, j + 1);
        dfs(grid, visited, i - 1, j);
        dfs(grid, visited, i, j - 1);
        // return;

    }

    public int numIslands(char[][] grid) {
        int visited[][] = new int[grid.length][grid[0].length];

        int result = 0;
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                if (visited[i][j] == 0 && grid[i][j] == '1') {
                    result++;
                    dfs(grid, visited, i, j);
                }
            }
        }
        return result;
    }
}
