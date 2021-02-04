



	public class InsertionSort {


		public int[] insertionSort(int[] unsortedArray){

			int length = unsortedArray.length;
			int number;
			int previous;

			for(int i=1; i<length; i++){

				number = unsortedArray[i];
				previous = i-1;

				while(previous >= 0 && unsortedArray[previous] > number){

					unsortedArray[previous+1] = unsortedArray[previous];
					previous--;
				}

				unsortedArray[previous+1] = number;
			}

			int[] sortedArray = new int[unsortedArray.length];
			sortedArray = unsortedArray;
			return sortedArray;
		}

	}
