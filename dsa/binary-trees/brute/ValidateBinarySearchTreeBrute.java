


// Time: O(n) Space: O(n)
public class ValidateBinarySearchTreeBrute {
    public boolean isValidBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inorder(root, values);
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) <= values.get(i - 1)) return false;
        }
        return true;
    }
    private void inorder(TreeNode node, List<Integer> values) {
        if (node == null) return;
        inorder(node.left, values);
        values.add(node.val);
        inorder(node.right, values);
    }
   public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.startIndex = new TreeNode(1);
        root.endIndex = new TreeNode(3);
        System.out.println(isValidBST(root)); // true
    }
}
