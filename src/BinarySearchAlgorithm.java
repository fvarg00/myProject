import java.util.Arrays;
import java.util.Collections;


public class BinarySearchAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		Arrays.sort(arr);
		
		
		System.out.println(binarySearch(arr,3,0, arr.length-1));
		
	}
	
	static int binarySearch(int[] arr, int x, int low, int high){
		if(low > high) return -1;
		
		int mid = (low+high) >>> 1;
		if(arr[mid] < x  )
			return binarySearch(arr, x, mid +1 , high);
			
		else if( arr[mid] > x)
			return binarySearch(arr, x, low, mid -1);
		
		else
			return mid;
	}

}
