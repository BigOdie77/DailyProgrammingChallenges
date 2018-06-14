package daily.programming.challenge363;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Author: 		Eric Odette (BigOdie)
 * Date: 		06/13/2018
 * Last Edit: 	06/13/2018
 * Purpose: 	A class to solve the Daily Programmer Challenge #363: I before E except after C. To see a write-up of 
 * 				what this challenge includes see the attached "write-up" text file or image.
 *
 * TODO: 
 * 		- Revise the checkIBeforeE to trim down to one if statement that compares for both rules? (Error Handling as well)
 * 		- Add utility that will check if the word breaks the rule (returns true if it does)
 * 		- Add utility to the regex check that will account for multiple matches
 *
 */
public class WordChecker {
	
	/* Method Name: checkIBeforeE
	 * Arguments: a String which will be the word to be checked
	 * Returns: a boolean that depends on if the word conforms to the rule
	 * Purpose: to confirm whether the word passed in compiles to the I before E except after C rule from the English language
	 */	
	public boolean checkIBeforeE ( String word ) {
		if ( word.toLowerCase().contains( "ei" ) ) 
			if ( !word.toLowerCase().substring(  word.toLowerCase().indexOf( "ei" ) - 1 ).startsWith( "c" )) 
				return false;	
		if ( word.toLowerCase().contains( "ie" ) ) {
			if ( word.toLowerCase().substring(  word.toLowerCase().indexOf( "ie" ) - 1 ).startsWith( "c" ))
				return false;
		}
			
		return true;
	}
	
	/* Method Name: checkRegexIBeforeE
	 * Arguments: a String which will be the word to be checked
	 * Returns: a boolean that depends on if the word conforms to the rule
	 * Purpose: to confirm if a word conforms to the i before e rule except after c, but using Regular Expressions
	 */
	public boolean checkRegexIBeforeE ( String word ) {
		Pattern patternEI = Pattern.compile( "(?i)([^c]ei)|(cie)" );
		Matcher matcherEI = patternEI.matcher( word );
		if ( matcherEI.find()) // What if there are multiple matches?
			return false;
		
		return true;
	}
}
