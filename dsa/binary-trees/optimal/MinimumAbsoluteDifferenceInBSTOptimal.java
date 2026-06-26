// Time: O(n) Space: O(h)
public class MinimumAbsoluteDifferenceInBSTOptimal {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inorder(root, values);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < values.size(); i++) {
            for (int j = i + 1; j < values.size(); j++) {
                minDiff = Math.min(minDiff, Math.abs(values.get(i) - values.get(j)));
            }
        }
        return minDiff;
    }
    private void inorder(TreeNode node, List<Integer> values) {
        if (node == null) return;
        inorder(node.left, values);
        values.add(node.val);
        inorder(node.right, values);
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
