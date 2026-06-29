package dsa.trees;


public class BasicTree {

    public static void main(String[] args) {

    // Creating a tree manually
    Node root = new Node(25);
    root.left = new Node(12);
    root.right = new Node(22);
    root.left.left = new Node(1);
    root.left.right = new Node(3);
    root.right.left = new Node(4);
    root.right.right = new Node(5);
    root.left.left.left = new Node(6);
    root.left.left.right = new Node(7);
    root.left.right.left = new Node(8);



    }
}
