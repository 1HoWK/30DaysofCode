package day16;

import java.util.Scanner;

public class StringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
			Integer.parseInt(s);
			System.out.println(s);
		} catch (Exception e) {
			System.out.println("Bad String");
		}
//		finally {
//			
//		}

	}

}
