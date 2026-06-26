
// Time: O(n) Space: O(n)
import java.util.*;
public class InvertBinaryTreeBrute {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        return root;
    }
   public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.startIndex = new TreeNode(2);
        root.endIndex = new TreeNode(7);
        TreeNode inverted = invertTree(root);
        System.out.println(inverted.startIndex.val + ", " + inverted.endIndex.val); // 7, 2
    }
}
