


public class MergeSort {

	private int[] list;

	public MergeSort(int[] unsorted) {

		list = unsorted;
	}

	public int[] getList() {

		return list;
	}

	public void sort() {

		list = sort(list);
	}

	private int[] sort(int[] unsorted) {

		int j=0;

		if (unsorted.length == 1) {
			return unsorted;
		}
		else {
			int[] left = new int[(unsorted.length/2)];
//			System.arraycopy( obje source, source position, destination obje, dest position, length);
			System.arraycopy(unsorted, 0, left, 0, left.length);

			int[] right = new int[(unsorted.length)-(left.length)];

			for(int i=left.length; i<right.length; i++ ){
				right[j] = unsorted[i];
				j++;
			}
			System.arraycopy(unsorted, left.length, right,0, right.length);

			left = sort(left);
			right = sort(right);

			merge(left, right, unsorted);

			return unsorted;
		}
	}

	private void merge(int[] left, int[] right, int[] result) {
		int x = 0;
		int y = 0;
		int k = 0;

		while (x < left.length &&
				y < right.length) {
			if (left[x] < right[y]) {
				result[k] = left[x];
				x++;
			}
			else {
				result[k] = right[y];
				y++;
			}
			k++;
		}

		int[] rest;
		int restIndex;
		if (x >= left.length) {

			rest = right;
			restIndex = y;
		}
		else {

			rest = left;
			restIndex = x;
		}

		for (int i=restIndex; i<rest.length; i++) {
			result[k] = rest[i];
			k++;
		}
	}

}