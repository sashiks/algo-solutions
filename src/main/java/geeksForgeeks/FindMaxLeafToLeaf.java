package geeksForgeeks;

import java.util.HashMap;
import java.util.Map;

public class FindMaxLeafToLeaf {
    private static Node prepNode(int i) {
        if(i == 1) {
            Node h = new Node(3);
            h.left = new Node(4);
            h.right = new Node(5);
            h.left.left = new Node(-10);
            h.left.right = new Node(4);

            return h;
        }
        return null;
    }
    public static void main(String... args) {
      FindMaxLeafToLeaf obj = new FindMaxLeafToLeaf();
      System.out.println(obj.maxPathSum(prepNode(1)));
    }

    int maxPathSum(Node root) {
        Map<Node, int[]> memo = new HashMap<>();
        calMax(root, memo);
        int max = Integer.MIN_VALUE;
        for(Node n: memo.keySet()) {
            int[] arr = memo.get(n);
            if(arr[0] != Integer.MIN_VALUE && arr[1] != Integer.MIN_VALUE) {
                max = Math.max(max, arr[0] + arr[1] - n.data);
            }
        }
        return max;
    }

    private int calMax(Node n, Map<Node, int[]> memo) {
        if(memo.containsKey(n)) {
            int[] arr = memo.get(n);
            return Math.max(arr[0], arr[1]);
        }
        if(n.left == null && n.right == null) {
            //Leaf Node
            return n.data;
        }
        int l = Integer.MIN_VALUE;
        int r = Integer.MIN_VALUE;
        if(n.left != null) {
            l = calMax(n.left, memo) + n.data;
        }
        if(n.right != null) {
            r = calMax(n.right, memo) + n.data;
        }
        memo.put(n, new int[]{l, r});
        return Math.max(l, r);
    }
}
