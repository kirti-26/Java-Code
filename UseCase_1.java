//Developer informing to the user what kind of exception he can face.
package com.excelr.learningjava.exceptionhandling.unchecked;

public class UseCase_1 {
	
	public static void findLengthAndSplitIn2Parts (String s) throws StringIndexOutOfBoundsException {
		//throws is only informing about the exception,not handling the exception. Execution stops even if throw is mentioned in the code.
		
		int len = s.length(); //gives string length
			System.out.println("String Length is: "+len);
		
		String part1 = s.substring(0,7);  //part 1 - 0 to 7 i.e. first 8 letters of string
			System.out.println("Part 1 is: "+part1);
	}
	public static void main(String[] args) {
	//try catch block is used catch the exception and continue the execution. 
	//exception caught ---> go to catch ---> continue execution after catch (execution will not continue from the try catch loop again.
		try {		
		findLengthAndSplitIn2Parts("Shivaganesh");
		findLengthAndSplitIn2Parts("Kirti");	//StringIndexOutOfBoundsExceptions is generated
		findLengthAndSplitIn2Parts("ExcelRSolutions"); //No further execution as exception occurred
		}catch (StringIndexOutOfBoundsException n) {
			System.out.println("Exception Messge: "+n.getMessage());	//will display only exception message
			System.out.println("Exception name & Message: "+n.toString());		//will display exception name and message
			n.printStackTrace();		//will display the complete exception info, as JVM throws exception in console
		}
		findLengthAndSplitIn2Parts("ExcelRSolutions");
	}
}
