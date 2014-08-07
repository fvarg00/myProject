import java.util.HashMap;
import java.util.Map;


public class CheckDuplicateInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] randomNumbers = {0,1,1,2,3,4,5,6,7,1,2,4,1};
		/*for (int i = 0; i < 10; i++) {
			randomNumbers[i] = i;
		}*/
		
		//randomNumbers[randomNumbers.length+1] = 2;
		
		System.out.println(randomNumbers);
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < randomNumbers.length; i++) {
			int num = randomNumbers[i];
			if(m.containsKey(num)){
				int occurrence = m.get(num).intValue();
				m.put(num, ++occurrence);
			}
			else{
				m.put(num, 1);
			}
			
		}
		
		System.out.println(m);
		

	}

}
