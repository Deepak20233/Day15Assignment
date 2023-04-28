package com.java;

public class CreateBST {

	public static void main(String[] args) {
BinarySearchTree tree = new BinarySearchTree();
        
        tree.insert(56);
        tree.insert(30);
        tree.insert(70);
        
        System.out.print("Inorder traversal of the created BST: ");
        tree.inorderTraversal();

	}

}
