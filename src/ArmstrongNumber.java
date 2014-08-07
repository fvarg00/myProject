
public class ArmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			i = 371;
			int a = i/100;

			int b = i?10;	
			int c = i%10;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			int sum = a^3+b^3+c^3;
			if(i==sum)
				System.out.println(sum);
		}

	}

}
