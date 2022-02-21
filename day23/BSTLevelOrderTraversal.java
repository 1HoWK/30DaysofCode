package day23;

import java.util.*;
import java.io.*;

public class BSTLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}

	static void levelOrder(Node root) {

//		// Write your code here
		Queue<Node> queue = new LinkedList<Node>();
		if (root != null) {
			// enqueue current root
			queue.add(root);

			// while there are nodes to process
			while (queue.size() != 0) {
				// dequeue next node
				Node node = queue.remove();

				// process tree's root;
				System.out.print(node.data + " ");
				// enqueue child elements from next level in order
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
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
