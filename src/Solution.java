class Solution {
    private int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        calc(root);
        return ans;   
    }
    private int calc(TreeNode root) {
        if (root == null) return 0;
        int l = calc(root.left);
        int r = calc(root.right);
        ans = Math.max(l + r, ans);
        return Math.max(l, r) + 1;
    }
}