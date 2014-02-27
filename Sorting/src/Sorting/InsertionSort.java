package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
		int[] sortedArray = unsortedArray;
		for (int i=1; i<sortedArray.length; i++) {
			int temp = sortedArray[i];
			int j;
			for (j=i-1; j>=0 && temp< sortedArray[j]; j--)
				sortedArray[j+1] = sortedArray[j];
			sortedArray[j+1] = temp;
		}
		return sortedArray;
	}
}
