package com.greatlearning.java;

import java.util.Scanner;

public class BinaryTreeArray {
	
	public int[] Tree ;
	public int size ,i;
	
	Scanner sc = new Scanner( System.in);
	
	public void insertValue() {
		System.out.println("Enter number of values to insert in the array binary tree");
		size = sc.nextInt();
		
		Tree = new int [size+1] ;
		for (i = 1; i <= size; i++) {
			System.out.println("Enter value " + i + ": ");
			Tree[i] = sc.nextInt();
			printTree();
		}
		
	}
	
	public void printTree() {

		System.out.println("Binary Tree. Root is: " + Tree[1]);

		for (int j = 1; j <= i; j++) {

		System.out.print(Tree[j] + " ");

		}

		}

		public static void main(String[] args) {

			BinaryTreeArray binarytreearray = new BinaryTreeArray();
			binarytreearray.insertValue();
		}
	

}
