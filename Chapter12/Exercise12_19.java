
/* 
 * Author: Renee Linford
 * Date: 6-10-19
 * OOP Exercise 12-19: Count Words
 */

import java.util.*;

public class Exercise12_19 {

	public static void main(String[] args) throws Exception {
		
		// Read Lincoln speech from URL.
		try {
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/Lincoln.txt");
		
			Scanner input = new Scanner(url.openStream());
			
			// Read text 
			int count = 0;
			while (input.hasNext()) {
				String word = input.next();
				count++;
			}
			
			System.out.print("Word count: " + count);
		}
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		}
		catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
		
	}

}
