class Solution {

    int dfs(int[][] grid,int[][] visited, int i, int j){

        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
            return 0;
        }

        if(visited[i][j]==1){
            return 0;
        }


        visited[i][j]=1;
        if(grid[i][j]==0){
            return 0;
        }


        return 1+dfs(grid,visited, i-1, j)+dfs(grid,visited, i+1, j)+dfs(grid,visited, i, j-1)+dfs(grid,visited, i, j+1);
    }

    public int maxAreaOfIsland(int[][] grid) {

        int[][] visited = new int[grid.length][grid[0].length];
        int result=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visited[i][j]==0 && grid[i][j]==1){
                    result=Math.max(result,dfs(grid,visited,i,j));
                }
            }
        }

        return result;

    }
}