package day29;

import java.util.*;

public class BitwiseAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			// the maximum integer to consider
			int N = scan.nextInt();
			// the limit of the result, inclusive
			int K = scan.nextInt();
			System.out.println(bitwiseAnd(N, K));
		}
	}

	public static int bitwiseAnd(int N, int K) {
		// Write your code here
		int maxValue = 0;
		for (int i = 1; i < N; i++) {
			for (int j = i + 1; j <= N; j++) {
				int temp = i & j;
				if (temp < K && temp > maxValue) {
					maxValue = temp;
				}
			}
		}

		return maxValue;
	}

}
