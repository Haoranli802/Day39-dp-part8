class Solution {
    public int rob(TreeNode root) {
        int[] res = robHelper(root);
        return Math.max(res[0], res[1]);
    }
    private int[] robHelper(TreeNode root){
        if(root == null) return new int[2];
        int[] left = robHelper(root.left);
        int[] right = robHelper(root.right);
        int[] res = new int[2];
        res[0] = root.val + left[1] + right[1];
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return res;
    }
}
/**
每个点返回两种选择，偷与不偷，如果偷当前的点的话，子点就没法偷了。如果不偷当前的点，子点可以
选择偷还是不偷，选最大值即可。

O(N), O(logN)
 */
