
// Time: O(n) Space: O(h)
public class DiameterOfBinaryTreeBrute {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int throughRoot = height(root.left) + height(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(throughRoot, Math.max(leftDiameter, rightDiameter));
    }
    private int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
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
