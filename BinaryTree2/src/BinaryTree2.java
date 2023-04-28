package com.java;

public class BinaryTree2 {
Node root;
    
    public BinaryTree2() {
        root = null;
    }
    
    public boolean search(int value) {
        return searchRec(root, value);
    }
    
    private boolean searchRec(Node root, int value) {
        if (root == null) {
            return false;
        }
        
        if (root.data == value) {
            return true;
        }
        
        if (value < root.data) {
            return searchRec(root.left, value);
        } else {
            return searchRec(root.right, value);
        }
    }

}
