package dynamic;

import java.util.Arrays;

public class Matrix01 {
    public static int[][] updateMatrix(int[][] mat) {
        for(int i = 0; i < mat.length; i++) {
            for (int j =0; j< mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    continue;
                } else {
                    int count = 0;
                    int[][] temp = mat.clone();
                    mat[i][j] = findZero(temp,i,j,count);
                }
            }
        }
        return mat;
    }

    public static int findZero(int[][] mat,int i, int j, int count) {
        if ( mat[i][j] == 1) {
            mat[i][j] = -1;
            count++;
            if (i - 1 >= 0) count = Math.min(count, findZero(mat,i-1,j,count));
            if (j - 1 >= 0) count = Math.min(count, findZero(mat,i,j-1,count));
            if (i + 1 < mat.length) count = Math.min(count, findZero(mat,i+1,j,count));
            if (i + 1 < mat[0].length) count = Math.min(count, findZero(mat,i,j+1,count));
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][] {{0,0,0},{0,1,0},{1,1,1}};
        System.out.println(Arrays.deepToString(updateMatrix(mat)));
    }
}
