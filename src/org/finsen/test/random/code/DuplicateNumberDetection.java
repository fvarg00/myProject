package org.finsen.test.random.code;
import java.util.HashMap;
import java.util.Map;


public class DuplicateNumberDetection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numArr = {1,2, 2, 3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6};
		
		Map map = new HashMap();
		for (int i = 0; i < numArr.length; i++) {
			int num = numArr[i];
			if(!map.containsKey(num))
				map.put(num, 1);
			else
				map.put(num, 1+((int)map.get(num)));
		}
		
		System.out.println(map);
	}

}
