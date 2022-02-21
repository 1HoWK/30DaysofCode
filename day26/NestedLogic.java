package day26;

import java.util.*;

public class NestedLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int fine = 0, returnedDay, returnedMonth, returnedYear, expectedDay, expectedMonth, expectedYear;

		returnedDay = scan.nextInt();
		returnedMonth = scan.nextInt();
		returnedYear = scan.nextInt();
		expectedDay = scan.nextInt();
		expectedMonth = scan.nextInt();
		expectedYear = scan.nextInt();

		// The book is returned in the following year, so the fine is a fixed 10000.
		if (returnedYear > expectedYear) {
			fine = 10000;
			
		// The book is returned after months but in the same year
		} else if ((returnedMonth > expectedMonth) && (returnedYear == expectedYear)) {
			fine = 500 * (returnedMonth - expectedMonth);
		
		// The book is returned few days late
		} else if ((returnedDay > expectedDay) && (returnedMonth == expectedMonth) && (returnedYear == expectedYear)) {
			fine = 15 * (returnedDay - expectedDay);
		}

		System.out.println(fine);

	}

}
