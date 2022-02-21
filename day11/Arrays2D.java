package day11;

import java.util.*;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int twoDArray[][] = new int[6][6];
		int sum = 0, maxSum = -63;		

		// input
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				twoDArray[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				sum = twoDArray[i][j] + twoDArray[i][j + 1] + twoDArray[i][j + 2] + twoDArray[i + 1][j + 1]
						+ twoDArray[i + 2][j] + twoDArray[i + 2][j + 1] + twoDArray[i + 2][j + 2];

				if (sum > maxSum) {
					maxSum = sum;
				}

			}
		}
		System.out.println(maxSum);

	}

}
