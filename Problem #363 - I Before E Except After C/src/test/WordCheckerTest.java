package test;

import daily.programming.challenge363.WordChecker;

public class WordCheckerTest {

	public static void main(String[] args) {
		WordChecker wc = new WordChecker();
		
		// TestSet
		String[] testSetArray = { "a", "zombie", "transceiver", "veil", "icier" };
		
		// Test with the normal function
		System.out.println("Testing check using String library methods ...");
		for (int i = 0; i < testSetArray.length; ++i) {
			System.out.println( "\nWord: " + testSetArray[i] + 
					"\nFollows rule: " + wc.checkIBeforeE( testSetArray[i] ) );
		}
		
		// Test with the Regular Expression function
		System.out.println("\nTesting check using Regular Expression ...");
		for (int i = 0; i < testSetArray.length; ++i) {
			System.out.println( "\nWord: " + testSetArray[i] + 
					"\nFollows rule: " + wc.checkRegexIBeforeE( testSetArray[i] ) );
		}
	}
}
