
// Time: O(n^2) Space: O(n)
public class MinimumAbsoluteDifferenceInBSTOptimal {
    private Integer prev = null;
    private int minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != null) minDiff = Math.min(minDiff, node.val - prev);
        prev = node.val;
        inorder(node.right);
    }
  public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.startIndex = new TreeNode(2);
        root.endIndex = new TreeNode(6);
        root.startIndex.startIndex = new TreeNode(1);
        root.startIndex.endIndex = new TreeNode(3);
        System.out.println(getMinimumDifference(root)); // 1
    }
  
}
