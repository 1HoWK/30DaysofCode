package day19;

import java.util.*;

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator findDivisor = new Calculator();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		System.out.println("I implemented: AdvancedArithmetic");
		System.out.println(findDivisor.divisorSum(num));
	}

}

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

	// return sum of all divisors of n
	@Override
	public int divisorSum(int n) {
//		int divisorSum = 0;
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				divisorSum += i;
//			}
//		}
		
		if(n == 1){
            return n;
        }
        
        // Find and sum divisors:
        int half = n/2;
        int divisorSum = n;
        do{
            if(n % half == 0){
            	divisorSum += half;
            }
        }while( half-- > 1 );
        
       
		return divisorSum;
	}

}
