public class BinaryRecursiveSearch implements Practice2Search {

	public String searchName(){
        return "Binary recursive search";
	}

	public int search(int[] arr, int target) {
    	return search(arr, 0, arr.length-1, target);
	}

	public int search(int[] arr, int start, int end, int target) {
    	int middle = (start + end) / 2;
    	if(end < start) {
        	return -1;
    	} 

    	if(target==arr[middle]) {
        	return middle;
    	} else if(target<arr[middle]) {
        	return search(arr, start, middle - 1, target);
    	} else {
        	return search(arr, middle + 1, end, target);
    	}
	}

}