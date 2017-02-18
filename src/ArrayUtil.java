
public class ArrayUtil {
	/** Shifts each array element to the next higher index, discarding the 
	 *  original last element, and inserts the new number at the front. 
	 *  @param arr the array to manipulate
	 * 		Precondition: arr.length > 0
	 *  @param num the new number to insert at the front of arr
	 * 		Postcondition: The original elements of arr have been shifted to 
	 * 				 	   the next higher index, and arr[0] == num. 
	 * 				  	   The original element at the highest index has been 
	 * 	  				   discarded.
	*/
	public static void shiftArray(int[] arr, int num) 
	{ /* to be implemented in part (a) */ 
		int[] keeper = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			keeper[i]=arr[i];
		}

		for (int i = 1; i < arr.length; i++) {
			arr[i]=keeper[i-1];
		}
		arr[0] = num;
	}
	
	// There may be methods that are not shown.
}
