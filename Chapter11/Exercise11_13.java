
import java.util.ArrayList;
import java.util.Scanner;

/* 
 * Author: Renee Linford
 * Date: 6-5-19
 * OOP Exercise 11-13: Remove duplicates from array list.
 */

public class Exercise11_13 {

	public static void main(String[] args) {
		// This main calls a method to remove duplicates from an array list.

		
		// Create new ArrayList.
		ArrayList<Integer> myList = new ArrayList<>();


		// Prompt user for 10 integers.
		System.out.print("Enter 10 integers separated by exactly one space: ");
		Scanner input = new Scanner(System.in);
		int value;

		
		// Loop to put input into myList.
		//ArrayList<Integer> myList = new ArrayList<>();
		for (int k = 0; k < 10; k++) {
			value = input.nextInt();
			myList.add(value);
		}


		// Invoke removeDuplicate method, & it will print distinct numbers.
		removeDuplicate(myList);


		/*
		// Check contents of myList.
		System.out.println();
		System.out.println("myList.toString = " + myList.toString());
		//System.out.print("removeDuplicate(myList) = " + removeDuplicate(myList));
		 */

	}


	public static void removeDuplicate(ArrayList<Integer> list) {
		// Method removed duplicate elements from an array list.


		//Create ArrayList
		ArrayList<Integer> distinctNum = new ArrayList<>(list.size());


		// Find distinct elements, add to distinctNum list.
		for (int i = 0; i < list.size(); i++) {
			// If element not in list, add to arrayList & print.
			if (!distinctNum.contains(list.get(i))) { 
				distinctNum.add(list.get(i));
			}
		}


		// Print distinctNum ArrayList.
		System.out.print("The distinct integers are ");
		for (int j = 0; j < distinctNum.size(); j++) {
			System.out.print(distinctNum.get(j) + " ");
		}
	}



}


