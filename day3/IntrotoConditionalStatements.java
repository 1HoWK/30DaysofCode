package day3;

import java.util.*;

public class IntrotoConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		if((n % 2 != 0) || (n % 2 == 0 && n >= 6 && n <=20)) {
			System.out.println("Weird");
		}else if(n % 2 == 0 && ((n >= 2 && n <=5) || n > 20)){
			System.out.println("Not Weird");
		}
	}

}
