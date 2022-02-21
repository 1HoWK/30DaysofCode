package day18;

import java.util.*;

public class QueuesAndStacks {

	// stack and queue instance variables
	// stack helps us to read from the back
	Stack<Character> myStack = new Stack<>();
	// queue helps us to read from the beginning
	Queue<Character> myQueue = new LinkedList<>();

	// push a char onto stack
	void pushCharacter(char ch) {
		myStack.push(ch);
	}

	// enqueues a character in the queue instance variable.
	void enqueueCharacter(char ch) {
		myQueue.add(ch);
	}

	// pops and returns the character at the top of the stack instance variable
	char popCharacter() {
		return myStack.pop();
	}

	// dequeues and returns the first character in the queue instance variable
	char dequeueCharacter() {
		return myQueue.remove();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		QueuesAndStacks day18 = new QueuesAndStacks();
		Boolean isPalindrome = true;
		
		String s = scan.nextLine();
		for (int i = 0; i < s.length(); i++) {
			// enqueue it in a queue
			day18.enqueueCharacter(s.charAt(i));
			// push that same character onto a stack
			day18.pushCharacter(s.charAt(i));
		}
		
		for (int i = 0; i < s.length()/2; i++) {	// length divide by 2 because the middle character doesn't matter
			// dequeue the first character from the queue					
			// pop the top character off the stack
			// compare the two characters to see if they are the same
			if(day18.dequeueCharacter() != day18.popCharacter()) {
				isPalindrome = false;     				
				break;
			}
		}
		System.out.println("The word, " + s + ", is " + ((isPalindrome) ? "a palindrome." : "not a palindrome."));

	}

}
