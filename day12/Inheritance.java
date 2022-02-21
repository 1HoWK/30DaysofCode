package day12;

import java.util.*;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String lastName = scan.next(), firstName = scan.next();
		int idNumber= scan.nextInt(), size = scan.nextInt();
				
		int [] scores = new int[size];
		for (int i = 0; i < size; i++) {
			scores[i] = scan.nextInt();
        }
		Student newStud = new Student(firstName, lastName, idNumber, scores);
		System.out.println("Name: " + newStud.getFirstName() + ", " + newStud.getLastName());
		System.out.println("ID: " + newStud.getIdNumber());
		System.out.println("Grade: " + newStud.calculate());
	}
}

class Person {
	private String firstName;
	private String lastName;
	private int idNumber;

	public Person(String firstName, String lastName, int idNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

}

class Student extends Person {

	private int[] scores;

	public Student(String firstName, String lastName, int idNumber, int[] scores) {
		super(firstName, lastName, idNumber);
		// TODO Auto-generated constructor stub
		this.scores = scores;
	}

	public char calculate() {
		int sum = 0, average = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			average = sum / scores.length;
		}
		
		if (average >= 90 && average <= 100) {
			return 'O';
		} else if (average >= 80 && average < 90) {
			return 'E';
		} else if (average >= 70 && average < 80) {
			return 'A';
		} else if (average >= 55 && average < 70) {
			return 'P';
		} else if (average >= 40 && average < 55) {
			return 'D';
		} else {
			return 'T';
		}

	}

}
