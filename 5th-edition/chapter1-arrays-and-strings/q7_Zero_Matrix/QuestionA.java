package q7_Zero_Matrix;

import CtCILibrary.AssortedMethods;

public class QuestionA {

    public static void setZeros(int[][] matrix) {
	int rows[] = new int[matrix.length];
	int columns[] = new int[matrix[0].length];

	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix.length; j++) {
		if (matrix[i][j] == 0) {
		    rows[i] = 1;
		    columns[j] = 1;
		}
	    }
	}

	for (int i = 0; i < rows.length; i++) {
	    for (int j = 0; j < columns.length; j++) {
		if (rows[i] == 1 || columns[j] == 1) {
		    matrix[i][j] = 0;
		}
	    }
	}

    }

    public static void main(String[] args) {
	int nrows = 10;
	int ncols = 15;
	int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -10, 10);

	AssortedMethods.printMatrix(matrix);

	setZeros(matrix);

	System.out.println();

	AssortedMethods.printMatrix(matrix);
    }
}
