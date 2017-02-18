import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayUtilities {

	@Test
	public void testShiftArray() {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] testArr = {12, 1, 2, 3, 4, 5};
		
		ArrayUtil.shiftArray(arr, 12);
		
		assertArrayEquals(testArr, arr);
	}
	
	@Test
	public void testShiftMatrix() {
		int m[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		int testMatrix[][] = {
				{12, 1, 2, 3},
				{4, 5, 6, 7},
				{8, 9, 10, 11},
				{12, 13, 14, 15}
		};
		
		NumberMatrix nm = new NumberMatrix(m);
		nm.shiftyMatrix(12);
		
		assertArrayEquals(testMatrix, nm.getMatrix());
	}
	
	@Test
	public void testRotateMatrix() {
		int m[][] = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		int testMatrix[][] = {
				{16, 1, 2, 3},
				{4, 5, 6, 7},
				{8, 9, 10, 11},
				{12, 13, 14, 15}
		};
		
		NumberMatrix nm = new NumberMatrix(m);
		nm.rotateMatrix();
		
		assertArrayEquals(testMatrix, nm.getMatrix());
	}
}
