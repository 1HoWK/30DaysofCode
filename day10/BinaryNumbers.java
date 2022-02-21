package day10;

import java.util.*;

public class BinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//Stack<Integer> binary = new Stack<Integer>();

		int decimalNum = scan.nextInt();
		int countConsecutive1 = 0, maxConsecutive1 = 0;

		while (decimalNum != 0) {
			if (decimalNum % 2 == 1) {
				// will keep on increment if a number is not divisible by 2
				++countConsecutive1;
				if(countConsecutive1 >= maxConsecutive1) {
					maxConsecutive1 = countConsecutive1;
				}
			} else {
				// once a number is divisible by 2, that means the consecutive is stopped
				countConsecutive1 = 0;
			}
			//int remainder = decimalNum % 2;
			decimalNum /= 2;
			//binary.push(remainder);
		}
		// in a reverse way
		//System.out.println(binary.toString());
		System.out.println(maxConsecutive1);
	}

}
