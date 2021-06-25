package com.seanmyles.week5;

public class AsteriskLogger implements Logger {

//	public AsteriskLogger(String string) {
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void Log(String message) {
//		    4. The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String 
//			(e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console. 
		System.out.println("***" + message + "***");
	
	}
		
	@Override
	public void Error(String message) {
//			 5. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded
//				by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed: 
			/*
			 		*************** 

			 		***Error: Hello*** 

			 		*************** 
			 */
		String star = "*";
		System.out.println(star.repeat(message.length() + 13));
		System.out.println("***" + "Error: " + message + "***");
		System.out.println(star.repeat(message.length() + 13));
		

	}

}
