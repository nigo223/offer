package q12;
/*
    请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
    路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
    如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。
    例如 a b c e s f c s a d e e 这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，
    但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，
    路径不能再次进入该格子。

*/

public class Solution {
    private static final int[][] directions = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    private int M;
    private int N;
    
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        M = rows;
        N = cols;
        char[][] matrixII = buildMatrix(matrix, rows, cols);
        return false;
    }

    private char[][] buildMatrix(char[] matrix, int rows, int cols) {
        char[][] matrixII = new char[rows][cols];
        int row = 0;
        int col = 0;
        for (char c : matrix) {
            if (row == rows - 1) { // 换行
                row = 0;
                col++;
            }
            matrixII[row++][col] = c;
        }
        return matrixII;
    }

}
