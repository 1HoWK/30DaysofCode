package day5;

import java.util.*;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i < 11; i++) {
			int mathMultiple = n * i;
			System.out.println(n + " x " + i + " = " + mathMultiple);
		}
	}

}
