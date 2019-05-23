
/* 
 * Author: Renee Linford
 * Date: 5-23-19
 * OOP Exercise 10-25: New String Split Method
 */

import java.util.Scanner;

public class Exercise10_25 {

	public static void main(String[] args) {
		/* Main calls "split" method & prints out array.
		 Input string & desired delimiter ("regex").*/


		// Declare string and regex variables.
		String string = "My.Name.Is.Renee";
		String regex = ".";
		String [] splitString = new String[string.length()]; // Create new string array.


		// Call split method on splitString array.
		splitString = split(string, regex);


		// Loop prints splitString array.
		for (int j = 0; j < splitString.length; j++) {
			System.out.println("splitString[" + j + "] = " + splitString[j]);
		}

	}



	public static String[] split(String s, String regex) {
		/* This method returns an array of strings where each array index is a substring split by the delimiter, including the matching delimiter.*/

		// Create new array from given string "s". 		
		String [] stringArray = new String[s.length()];


		// Loop places string s into stringArray.
		for(int c = 0; c < s.length(); c++) {
			stringArray[c] = Character.toString(s.charAt(c));
		}


		// Count checks stringArray for number of regex sybmols.
		int count = 0;
		for (int d = 0; d < s.length(); d++) {
			// If character is regex symbol count increases.
			if (regex.equals(Character.toString(s.charAt(d)))) {
				count++;
			}
		}
		// Total number of regex symbols = count x 2 + 1;
		count = count * 2 + 1;


		// Nested loops concat array characters until one matches the regex.
		// If character matches regex, then array index equals regex.
		String [] concatArray = new String[count]; // New concatArray for return value.
		String subString = ""; // String for concating.

		int m = 0; // Count "m" tracks concatArray index.
		for (int i = 0; i < s.length(); i++) {
			// If character is not regex, add to subString.
			if (!(regex.equals(stringArray[i]))) {
				subString += stringArray[i];
			}
			// If character is regex:
			if (regex.equals(stringArray[i])) {
				concatArray[m] = subString;  // Place subString into concatArray.
				m++;
				concatArray[m] = regex; // Place regex into next index in concatArray.
				m++;
				subString = ""; // Reset subString to null.
			}
		}
		concatArray[m] = subString; // Add last subString to the last array index.

		return concatArray;

	}



}

