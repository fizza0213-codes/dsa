
// Time: O(n) Space: O(h)
public class MaximumDepthOfBinaryTreeOptimal {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
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
