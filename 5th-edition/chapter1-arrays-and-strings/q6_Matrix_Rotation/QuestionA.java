package q6_Matrix_Rotation;

public class QuestionA {

    public static void rotate(int matrix[][]) {
	int end = matrix.length - 1, begin = 0, i = 0;
	while (begin < end) {
	    i = begin;
	    while (i < end) {
		// save top_left
		int tmp = matrix[begin][i];

		// top_right -> top_left
		matrix[begin][i] = matrix[i][end];

		// bottom_right -> top_left
		matrix[i][end] = matrix[end][end - i + begin];

		// bottom_left -> bottom_right
		matrix[end][end - i + begin] = matrix[end - i + begin][begin];

		// top_left -> bottom_left
		matrix[end - i + begin][begin] = tmp;
		i++;
	    }

	    begin++;
	    end--;

	}
    }

    public static void print(int[][] matrix) {
	for (int i = 0; i < matrix.length; i++) {
	    for (int j = 0; j < matrix.length; j++) {
		System.out.print(matrix[i][j]);
		System.out.print(' ');
	    }
	    System.out.println(' ');
	}
	System.out.println(' ');
    }

    public static void main(String[] args) {
	for (int i = 1; i <= 20; i++) {
	    int matrix[][] = new int[i][i];

	    for (int j = 0; j < i; j++) {
		for (int k = 0; k < i; k++) {
		    matrix[j][k] = j;
		}
	    }

	    System.out.println("Antes: " + i + "x" + i);
	    print(matrix);
	    rotate(matrix);
	    System.out.println("Depois: " + i + "x" + i);
	    print(matrix);

	}

    }
}
