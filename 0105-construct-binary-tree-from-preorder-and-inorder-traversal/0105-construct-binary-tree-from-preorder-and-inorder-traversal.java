/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();
    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(preorder, 0, inorder.length - 1);
    }

    public TreeNode helper(int[] preorder, int inStart, int inEnd) {

        if (inStart > inEnd) {
            return null;
        }

        // Current preorder element becomes root
        int value = preorder[preIndex++];

        TreeNode root = new TreeNode(value);

        // Find root in inorder
        int rootIndex = map.get(value);

        // IMPORTANT: left first, then right
        root.left = helper(preorder, inStart, rootIndex - 1);
        root.right = helper(preorder, rootIndex + 1, inEnd);

        return root;
    }
}