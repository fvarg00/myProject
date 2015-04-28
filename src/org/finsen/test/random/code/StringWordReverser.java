package org.finsen.test.random.code;

public class StringWordReverser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "This String needs to be reversed";
		String[] strArr = s.split(" ");
		String reversdString = "";
		for (int i = strArr.length-1 ; i >=0; i--) {
			reversdString+=strArr[i]+" ";
		}

		System.out.println(reversdString);
	}
	

}
