// Time: O(n) Space: O(h)
public class DiameterOfBinaryTreeOptimal {
    private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        height(root);
        return diameter;
    }
    private int height(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
  public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.startIndex = new TreeNode(2);
        root.endIndex = new TreeNode(3);
        root.startIndex.startIndex = new TreeNode(4);
        root.startIndex.endIndex = new TreeNode(5);
        System.out.println(diameterOfBinaryTree(root)); // 3
    }
}
