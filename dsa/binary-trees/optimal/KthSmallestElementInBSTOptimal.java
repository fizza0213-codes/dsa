
// Time: O(k) Space: O(h)
import java.util.*;
public class KthSmallestElementInBSTOptimal {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;
        int count = 0;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            count++;
            if (count == k) return current.val;
            current = current.right;
        }
        return -1;
    }
   public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.startIndex = new TreeNode(3);
        root.endIndex = new TreeNode(6);
        root.startIndex.startIndex = new TreeNode(2);
        root.startIndex.endIndex = new TreeNode(4);
        System.out.println(kthSmallest(root, 3)); // 4
    }
  
}
