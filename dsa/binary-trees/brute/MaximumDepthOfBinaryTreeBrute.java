// Time: O(n) Space: O(n)
import java.util.*;
public class MaximumDepthOfBinaryTreeBrute {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            depth++;
        }
        return depth;
    }
   public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.startIndex = new TreeNode(9);
        root.endIndex = new TreeNode(20);
        root.endIndex.startIndex = new TreeNode(15);
        root.endIndex.endIndex = new TreeNode(7);
        System.out.println(maxDepth(root)); // 3
    }
  
}
