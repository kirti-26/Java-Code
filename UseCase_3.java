//Developer handles the exceptions - one try with single catch
package com.excelr.learningjava.exceptionhandling.unchecked;

public class UseCase_3 {
	
	public static void findLengthAndSplitIn2Parts (String s) {
		//developer writes the try catch block, thus throws is not required
		
	try {
		int len = s.length(); //gives string length
			System.out.println("String Length is: "+len);
		
		String part1 = s.substring(0,7);  //part 1 - 0 to 7 i.e. first 8 letters of string
			System.out.println("Part 1 is: "+part1);
	}catch (NullPointerException | StringIndexOutOfBoundsException ee) {
		if(ee instanceof NullPointerException) System.out.println("Null is not a valid input");
		else if(ee instanceof StringIndexOutOfBoundsException) System.out.println("Minimum string length should be of 8 characters");
	}
}

	public static void main(String[] args) {
	
		findLengthAndSplitIn2Parts("Shivaganesh");
		findLengthAndSplitIn2Parts("Kirti");	//StringIndexOutOfBoundsExceptions is generated
		findLengthAndSplitIn2Parts("ExcelRSolutions"); //No further execution as exception occurred
		
	}
}
