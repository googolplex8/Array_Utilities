
public class NumberMatrix {
	private int[][] matrix;

	/** Constructs a number matrix. */
	public NumberMatrix(int[][] m) {
		matrix = m;
	}

	/**
	 * Shifts each matrix element to the next position in row-major order and
	 * inserts the new number at the front. The last element in the last row is
	 * discarded.
	 * 
	 * @param num
	 *            the new number to insert at the front of matrix
	 *            Postcondition:The original elements of matrix have been
	 *            shifted to the next higher position in row-major order, and
	 *            matrix[0][0] == num. The original last element in the last row
	 *            is discarded.
	 */
	public void shiftMatrix(int num) { /* to be implemented in part (b) */
		int[][] keeper = new int[matrix.length][matrix[0].length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				keeper[row][col] = matrix[row][col];
			}
		}

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if (col == 0) {
					if (row == 0) {
						matrix[0][0] = num;
					} else {
						matrix[row][col] = keeper[row - 1][matrix[row - 1].length - 1];
					}
				} else {
					matrix[row][col] = keeper[row][col - 1];
				}

			}

		}
	}

	public void shiftyMatrix(int num) { /* to be implemented in part (b) */
		int[][] keeper = new int[matrix.length][matrix[0].length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				keeper[row][col] = matrix[row][col];
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			if(row==0){
			ArrayUtil.shiftArray(matrix[0], num);	
			}
			else{
				ArrayUtil.shiftArray(matrix[row], (keeper[row - 1][matrix[row - 1].length - 1]));
			}
		}
	}
	/**
	 * Rotates each matrix element to the next higher position in row-major
	 * order. Postcondition: The original elements of matrix have been shifted
	 * to the next higher position in row-major order, and matrix[0][0] == the
	 * original last element.
	 */
	public void rotateMatrix() { /* to be implemented in part (c) */
		shiftMatrix(matrix[matrix.length - 1][matrix[0].length - 1]);
	}

	// There may be instance variables, constructors, and methods that are not
	// shown.

	public int[][] getMatrix() {
		return matrix;
	}
}
