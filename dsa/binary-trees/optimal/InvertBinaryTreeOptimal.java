// Time: O(n) Space: O(h)
public class InvertBinaryTreeOptimal {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
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
