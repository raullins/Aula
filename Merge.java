package mergeSort;

public class Merge {

	private Merge() {

	}

	// is v < w ?
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	// check if array is sorted - useful for debugging
	private static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length - 1);
	}

	private static boolean isSorted(Comparable[] a, int lo, in hi) {
		for (int i = lo + 1; i <= hi; i++) {
			if (less(a[1], a[i - 1]))
				return false;
			return true;
		}
	}
	
	private static void sorte (Comparable[] a, Comprable[] aux, int lo, int hi) {
		
	}

	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
		// precondidtion: a[lo ... mid] and a[mid+1 ... hi] are sorted subarrays
		assert isSorted(a, lo, mid);
		assert isSorted(a, mid + 1, hi);

		// copy to aux[]
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}

		// merge back to a[]
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[j++];
			else if (less(aux[j], aux[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[j++];
		}

		// postcodition: a[lo ... hi] is sorted
		assert isSorted(a, lo, hi);
	}

}
