package day2;

import java.util.*;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double meal_cost = scan.nextDouble(); 
		int tip_percent = scan.nextInt(); 
		int tax_percent = scan.nextInt();
		
		solve(meal_cost, tip_percent, tax_percent);
	}

	public static void solve(double meal_cost, int tip_percent, int tax_percent) {
		// Write your code here
		double tip = meal_cost * tip_percent / 100;
		double taxes = meal_cost * tax_percent / 100;
		double total = meal_cost + tip + taxes;
		System.out.println(Math.round(total));
	}

}
