package day6;

import java.util.*;

public class LetsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();		
		scan.nextLine();
		
		for (int i = 0; i < n; i++) {			
			String s = scan.nextLine();
			String evenIndexChar = "", oddIndexChar = "";
			
			for (int j = 0; j < s.length(); j++) {
				if (j % 2 == 0)
					evenIndexChar += s.charAt(j);
				else
					oddIndexChar += s.charAt(j);
			}
			System.out.println(evenIndexChar + " " + oddIndexChar);
		}

	}

}
