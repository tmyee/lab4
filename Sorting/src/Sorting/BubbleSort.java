package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		int j;
		boolean pass = true;
		int temp;

		while(pass) {
			pass = false;
			for(int i = 0; i < unsortedArray.length-1; i++) {
				if(unsortedArray[i] < unsortedArray[i+1]) {
					tmep = unsortedArray[i];
					unsortedArray[i] = unsortedArray[i+1];
					unsortedArray[i+1] = temp;
					flag = true;
				}
			}
		}

		return unsortedArray;

		return null;
	}
}
