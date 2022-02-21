package day17;

import java.util.*;

public class MoreExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int n, p;
		Calculator newCalculator = new Calculator();
		while (times != 0) {
			try {
				n = scan.nextInt();
				p = scan.nextInt();
				System.out.println(newCalculator.power(n, p));
				
			}catch(Exception e) {
				// to print the throw message
				System.out.println(e.getMessage());
			}
			times--;			
		}
		
	}

}

class Calculator {
	int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		} else {
			return (int) Math.pow(n, p);
		}
	}
}

