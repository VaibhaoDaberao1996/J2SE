package arrays;

public class FindFirstAndLastPosition {

	public static void main(String[] args) {
		
		int[] sortedArray = { 1, 2, 2, 2, 3, 4, 5, 6 };
		int target = 2;

		// Find the first and last positions of the target
		int[] positions = findFirstAndLastPosition(sortedArray, target);

		System.out.println("First position: " + positions[0]);
		System.out.println("Last position: " + positions[1]);
	}

	
	public static int[] findFirstAndLastPosition(int[] array, int target) {
		
		int[] result = { -1, -1 }; // Default if not found

		// Find the first occurrence
		int low = 0, high = array.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[mid] < target) {
				low = mid + 1;
			} else if (array[mid] > target) {
				high = mid - 1;
			} else {
				// Found the target, move to the left to find the first occurrence
				result[0] = mid;
				high = mid - 1;
			}
		}

		// If the first position was not found, no need to check for the last position
		if (result[0] == -1) {
			return result;
		}

		// Find the last occurrence
		low = result[0];
		high = array.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (array[mid] < target) {
				low = mid + 1;
			} else if (array[mid] > target) {
				high = mid - 1;
			} else {
				// Found the target, move to the right to find the last occurrence
				result[1] = mid;
				low = mid + 1;
			}
		}

		return result;
	}
}
