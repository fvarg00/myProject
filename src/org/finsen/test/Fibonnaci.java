package org.finsen.test;

public class Fibonnaci {
	
	public static void main(String[] args) {
		int a=0,b=1;
		int sum=0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 10; i++) {
			sum =a+b;
			a=b;
			b=sum;
			System.out.println(sum);
			
		}
	}

//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		int a = 1;
//		int b = 1;
//		int sum = 0;
//		for (int i = 0; i < 12; i++) {
//			sum = a + b;
//			a = b; b=sum;
//			System.out.println(sum);
//		}
//
//	}

}
