


public class QuickSort {

	private static int [] array;

	public QuickSort(int[] unsorted){

		array = unsorted;
	}


	// This method sorts an array and internally calls quickSort
	public static void sort(){
		int left = 0;
		int right = array.length-1;

		quickSort(left, right);
	}

	// This method is used to sort the array using quicksort algorithm.
	// It takes left and the right end of the array as two cursors
	private static void quickSort(int left,int right){

		// If both cursor scanned the complete array, quicksort exits
		if(left >= right)
			return;

		// Pivot using median of 3 approach
		int pivot = getMedian(left, right);
		int partition = partition(left, right, pivot);

		// Recursively, calls the quicksort with the different left and right parameters of the sub-array
		quickSort(0, partition-1);
		quickSort(partition+1, right);
	}

	// This method is used to partition the given array and returns the integer which points to the sorted pivot index
	private static int partition(int left,int right,int pivot){
		int leftCursor = left-1;
		int rightCursor = right;
		while(leftCursor < rightCursor){
			while(array[++leftCursor] < pivot);
			while(rightCursor > 0 && array[--rightCursor] > pivot);
			if(leftCursor >= rightCursor){
				break;
			}else{
				swap(leftCursor, rightCursor);
			}
		}
		swap(leftCursor, right);
		return leftCursor;
	}

	public static int getMedian(int left,int right){
		int center = (left+right)/2;

		if(array[left] > array[center])
			swap(left,center);

		if(array[left] > array[right])
			swap(left, right);

		if(array[center] > array[right])
			swap(center, right);

		swap(center, right);
		return array[right];
	}

	// This method is used to swap the values between the two given index
	public static void swap(int left,int right){
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	public static void printArray(){
		for(int i : array){
			System.out.print(i+" ");
		}
	}

	public static int[] getArray(){
		int []array = {15, 19, 4, 3, 18, 6, 2, 12, 7, 9, 11, 16};

		return array;
	}

}