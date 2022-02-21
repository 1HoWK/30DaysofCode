package day14;

import java.util.*;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] elements = new int[size];
		for (int i = 0; i < size; i++) {
			elements[i] = scan.nextInt();
		}		
		Difference diff = new Difference(elements);
		diff.computeDifference();

	}

}

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		// the largest minus the smallest;
		int smallestNum = elements[1], largestNum = elements[1];
		for(int i : elements) {
			//find smallest
			if(i <= smallestNum ) {
				smallestNum = i;
			}
			// find largest
			if(i >= largestNum) {
				largestNum = i;
			}
		}
		maximumDifference = Math.abs(smallestNum - largestNum);
		System.out.println(maximumDifference);
	}
}
