package geeksForgeeks;

public class CheckBST {
    boolean isBST(Node root)
    {
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean checkBST(Node root, int min, int max) {
        if(root == null) {
            return true;
        }
        if(root.left == null && root.right == null) {
            return true;
        }
        if(root.left != null && (root.left.data >= root.data || root.left.data >= max || root.left.data <=min)) {
            return false;
        }
        if(root.right != null && (root.right.data <= root.data || root.right.data <= min ||  root.right.data >= max)) {
            return false;
        }
        return checkBST(root.left, min, root.data)
                && checkBST(root.right, root.data, max) ;
    }

    public static void main(String... args) {
        //prepare Data
    }

    public static void createData(Node parent){
        // Not BST
        Node root = new Node(3);
        parent.left = new Node(parent.data--);
        parent.right = new Node(parent.data++);

    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}