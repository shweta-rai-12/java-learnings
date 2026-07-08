package dsa.trees;

public class InvertBinaryTree {

    public static Node invertBinaryTree(Node root){
        return new Node(0);
    }

    public static void main(String[] args){
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        System.out.println("Original Binary tree:");

        System.out.println("Inverted Binary Tree:");
        invertBinaryTree(root);

    }
}
