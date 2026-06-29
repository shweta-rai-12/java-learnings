package dsa.trees;

public class MaxDepthTree {


    // Depth First Search :
    public static int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        return Math.max(leftMax,rightMax)+1;
    }


    public static void main(String[] args) {
        Node root = new Node(25);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);
        root.left.left.left.left = new Node(8);

        System.out.println(" Maximum Depth Tree :" + maxDepth(root));
    }
}
