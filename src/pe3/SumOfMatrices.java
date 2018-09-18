package pe3;

public class SumOfMatrices {
    int rows;
    int columns;
    int[][] matrix;
    public SumOfMatrices(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.matrix = new int[rows][columns];
    }

    public static int[][] addTwoMatrices(int rows, int columns, int[][] matrix1, int[][] matrix2){
        SumOfMatrices sum = new SumOfMatrices(rows, columns);
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                sum.matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum.matrix;
    }
}
