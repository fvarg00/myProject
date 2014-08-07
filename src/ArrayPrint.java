import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		List l = Arrays.asList(arr);
		System.out.println(l);
		
		for(int i=0; i<arr.length; i++){
			
			System.out.println(arr[i]);
			
		}
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);

	}

}
