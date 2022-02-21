package day8;

import java.util.*;


public class DictionariesAndMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Long> friendsPhoneNum = new HashMap<String, Long>();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			String friendsName = scan.next();
			Long phoneNum = scan.nextLong();
			friendsPhoneNum.put(friendsName, phoneNum);
		}
		String findName = "";
		while(scan.hasNextLine()) {
			findName = scan.next();
			if (friendsPhoneNum.containsKey(findName)) {
				System.out.println(findName + "=" + friendsPhoneNum.get(findName));
			} else {
				System.out.println("Not found");
			}
		}

	}

}
