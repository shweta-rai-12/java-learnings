package dsa.trees;

public class SameTree {

    //Check whether the two trees are same or not
    public static Boolean sameTree(Node root, Node root2){
        return false;
    }


    public static void main(String[] args) {
        Node root = new Node(8);
        root.left.right = new Node(8);
        root.left.right.left = new Node(8);
        root.left.right.right = new Node(8);
        root.left.right.right.left = new Node(8);
        root.left.right.right.right = new Node(8);

        Node root2 = new Node(8);
        root2.left.right = new Node(8);
        root2.left.right.left = new Node(8);
        root2.left.right.right = new Node(8);
        root2.left.right.right.left = new Node(8);
        root2.left.right.right.right = new Node(8);


        System.out.println("Are the above two trees are same : " + sameTree(root,root2));

    }
}
