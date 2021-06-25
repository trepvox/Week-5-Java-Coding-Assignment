package com.seanmyles.week5;

public class App {

	public static void main(String[] args) {
//     	10.)   In this class instantiate an instance of each of your logger classes that implement the Logger interface. 
		Logger log = new AsteriskLogger();
		Logger spacelog = new SpacedLogger();  
		
		log.Log("Hello");
		System.out.println();
		log.Error("Hello");
		System.out.println();
		log.Log("I hope that one day this will all make sense ");
		System.out.println();
		log.Error("I hope that one day this will all make sense ");
		System.out.println();
		
		spacelog.Log("Hello");
		System.out.println();
		spacelog.Error("Hello");
		System.out.println();
		spacelog.Log("I start out every week feeling confident");
		System.out.println();
		spacelog.Error("I start out every week feeling confident");
		System.out.println();
		
	//	System.out.println(addSpaceBetweenChar(2, "Hello", ' '));
		
	}
	//I was trying out different ways to see how to do this before I reached out for help.
	
//	public static String addSpaceBetweenChar(int distance, String messages, char c) {
//		StringBuilder m = new StringBuilder();
//		char[] charArrayofMessages = messages.toCharArray();
//		for(int ch = 0; ch < charArrayofMessages.length; ch++) {
////			if (ch % distance == 0) {
//				m.append(c).append(charArrayofMessages[ch]);
////			}
////			else {
////				m.append(charArrayofMessages[ch] );
////			}
//			
//		}
//		return m.toString();
//	}

}
