package day28;

import java.util.*;
import java.util.regex.*;

public class RegExPatternsandIntrotoDatabases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// store into a list and do sorting later
		List<String> nameList = new ArrayList<>();
		Matcher m;
		Pattern p = Pattern.compile("[a-z]+@gmail\\.com$");

		int size = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < size; i++) {
			String firstName = scan.next();
			String email = scan.nextLine();
			m = p.matcher(email); 
			if (m.find())
				nameList.add(firstName.toLowerCase());
		}
		// sort a list of collection alphabetically
		Collections.sort(nameList);

		for (String name : nameList) {
			System.out.println(name);
		}
	}

}
