package day25;

import java.util.*;

public class RunningTimeAndComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		for (int i = 0; i < size; i++) {
			int num = scan.nextInt();
			if (isPrime(num)) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}

		}
	}

	// O(n) Time Complexity
//	static int i = 2;
//	public static boolean isPrime(int n)
//	{
//		
//	    if (n == 0 || n == 1)
//	    {
//	        return false;
//	    }
//	
//	    if (n == i)
//	        return true;
//	    
//	    if (n % i == 0)
//	    {
//	        return false;
//	    }
//	    i++;
//	    return isPrime(n);
//	}

	// O(n^1/2) Time Complexity
	static boolean isPrime(int n) {

		if (n <= 1) { // check if number is less than or equal to 1
			return false;

		} else if (n == 2) { // check if number is 2
			return true;

		} else if (n % 2 == 0) { // check if n is a multiple of 2
			return false;
		}

		// if none of the above , then just check the odds, faster
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
