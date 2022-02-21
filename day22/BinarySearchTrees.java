package day22;

import java.util.*;

public class BinarySearchTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}

	public static int getHeight(Node root) {
		// Write your code here
		// find the longest path

		// 1st method
//		int leftHeight = 0;
//		int rightHeight = 0;
//		if (root.left != null) {
//			leftHeight = getHeight(root.left) + 1;
//		}
//		if (root.right != null) {
//			rightHeight = getHeight(root.right) + 1;
//		}
//		if (leftHeight > rightHeight) {
//			return leftHeight;
//		} else {
//			return rightHeight;
//		}
		
		// 2nd method
		if (root == null) {
			return -1;
		} else {
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
		}

	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

}

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}
