// Time: O(n) Space: O(h)
public class ValidateBinarySearchTreeOptimal {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
    private boolean validate(TreeNode node, Integer min, Integer max) {
        if (node == null) return true;
        if (min != null && node.val <= min) return false;
        if (max != null && node.val >= max) return false;
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.startIndex = new TreeNode(1);
        root.endIndex = new TreeNode(3);
        System.out.println(isValidBST(root)); // true
    }
}

