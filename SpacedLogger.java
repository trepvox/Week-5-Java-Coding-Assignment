package com.seanmyles.week5;

public class SpacedLogger implements Logger {

//	public SpacedLogger(String string) {
//		// TODO Auto-generated constructor stub
//	}


	@Override
	public void Log(String message) {
		for (int i = 0; i < message.length(); i++) {
		message.charAt(i);
		System.out.print(message.charAt(i) + " ");
		}
		System.out.println();
	}

	
	@Override
	public void Error(String message) {
		System.out.print("ERROR : ");
		for (int i = 0; i < message.length(); i++) {
		message.charAt(i);
		System.out.print(message.charAt(i) + " ");
		}
		System.out.println();
	}
	
//		6.) The SpacedLogger should add spaces between each character of the String argument passed into its methods. 
	

	


	}
	



