
public class RecursiveFibonnaci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			
			System.out.println(fib(i));
		}
		

	}
	
	private static int fib(int n){
		if (n == 0 || n == 1)
	    {
	      return n;
	    }
		else
			return fib(n - 1) + fib(n - 2);
	}

}
