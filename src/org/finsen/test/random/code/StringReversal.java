package org.finsen.test.random.code;

public class StringReversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "toBeReversed";
		String reversedString="";
		for (int i = s.length()-1; i >= 0; i--) {
			reversedString+=s.charAt(i);
		}
		
		System.out.println(reversedString);
	}

}
