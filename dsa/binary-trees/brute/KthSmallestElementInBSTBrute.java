
// Time: O(n) Space: O(n)
import java.util.*;
public class KthSmallestElementInBSTBrute {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        inorder(root, values);
        return values.get(k - 1);
    }
    private void inorder(TreeNode node, List<Integer> values) {
        if (node == null) return;
        inorder(node.left, values);
        values.add(node.val);
        inorder(node.right, values);
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
