package day20;

import java.util.*;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		 // Track number of elements swapped during a single array traversal
		int numberOfSwaps = 0;
		int n = scan.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		// 1st for loop to go through possible number of rounds 
		for (int i = 0; i < n; i++) {
			// 2nd loop for comparison
			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					int temp = a[j];				
					a[j] = a[j + 1];
					a[j + 1] = temp;	
					numberOfSwaps++;
				}
			}
			// If no elements were swapped during a traversal, array is sorted
			if (numberOfSwaps == 0) {
				break;
			}
		}		
		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length - 1]);
	}

}
