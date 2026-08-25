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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>();
        dfs(root1,r1);
        dfs(root2,r2);
        return r1.equals(r2);
        
    }
    public void dfs(TreeNode root,ArrayList<Integer> arr){
        if(root == null )return ;
        if(root.left == null && root.right == null){
            arr.add(root.val);
        }
        dfs(root.left,arr);
        dfs(root.right,arr);

    }


}