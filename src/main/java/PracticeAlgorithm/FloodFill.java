package PracticeAlgorithm;

import java.util.Arrays;

public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor ) {
            dfs(image,sr,sc,color,newColor);
        }
        return image;
    }

    private static void dfs(int[][] image, int sr, int sc, int color, int newColor) {
        if (image[sr][sc] == color) {
            image[sr][sc]= newColor;
            if (sr -1 >= 0) dfs(image,sr-1,sc,color,newColor);
            if (sc -1 >= 0) dfs(image,sr,sc-1,color,newColor);
            if (sr + 1 < image.length ) dfs(image,sr+1,sc,color,newColor);
            if (sc + 1 < image[0].length ) dfs(image,sr,sc+1,color,newColor);
        }
    }

    public static void main (String[] args) {
        int[][] image = new int[][] {{1,1,1},{1,1,0},{1,0,1}};
        System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 2)));
    }
}
