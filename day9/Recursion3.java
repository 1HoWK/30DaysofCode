package day9;

import java.util.*;

public class Recursion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(factorial(n));
	}

	public static int factorial(int n) {
		// Write your code here
		if (n == 1 || n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

	public static int exponentiation(int n, int p) {
		// Write your code here
		if (p <= 0) {
			return 1;
		} else {
			return n * exponentiation(n, p - 1);
		}

	}

}
