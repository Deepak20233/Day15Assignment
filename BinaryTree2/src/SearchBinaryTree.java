package com.java;

public class SearchBinaryTree {

	public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();
        
        tree.root = new Node(56);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        
        int searchValue = 63;
        
        if (tree.search(searchValue)) {
            System.out.println("Value " + searchValue + " found in the Binary Tree");
        } else {
            System.out.println("Value " + searchValue + " not found in the Binary Tree");
        }
    

	}

}
