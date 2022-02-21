package day21;

import java.util.*;

public class Generics {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[] intArray = new Integer[n];
		for (int i = 0; i < n; i++) {
			intArray[i] = scanner.nextInt();
		}

		n = scanner.nextInt();
		String[] stringArray = new String[n];
		for (int i = 0; i < n; i++) {
			stringArray[i] = scanner.next();
		}

		Printer<Integer> intPrinter = new Printer<Integer>();
		Printer<String> stringPrinter = new Printer<String>();
		intPrinter.printArray(intArray);
		stringPrinter.printArray(stringArray);
		if (Printer.class.getDeclaredMethods().length > 1) {
			System.out.println("The Printer class should only have 1 method named printArray.");
		}
	}

}

//E - Element
// K - Key
// V - Value
// N - Number
// T - Type (e.g.: data type)
// S,U,V, etc. These are second, third, and fourth types for when T is already
// in use.

class Printer<T> {

	/**
	 * Method Name: printArray Print each element of the generic array on a new
	 * line. Do not return anything.
	 * 
	 * @param A generic array
	 **/

	// generic elements <E>
	void printArray(T[] genericArr) {
		for (T i : genericArr) {
			System.out.println(i);
		}
	}

}
