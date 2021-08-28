package dfs;

public class MaxAreaOfIsland {

    public static int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i =0; i < grid.length; i++) {
            for (int j =0; j <grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int count = 0;
                    max = Math.max(max,dfsCount(grid,i,j,count));
                }
            }
        }
        return max;
    }

    public static int dfsCount(int[][] grid,int i, int j,int count) {
        if (grid[i][j] == 1) {
            count++;
            grid[i][j] = 0;
            if (i-1>=0) count = dfsCount(grid, i-1, j,count);
            if (j-1>=0) count = dfsCount(grid, i, j-1,count);
            if (i + 1 < grid.length) count = dfsCount(grid, i+1, j,count);
            if (j + 1 < grid[0].length) count = dfsCount(grid, i, j + 1,count);
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(maxAreaOfIsland(grid));
    }
}
