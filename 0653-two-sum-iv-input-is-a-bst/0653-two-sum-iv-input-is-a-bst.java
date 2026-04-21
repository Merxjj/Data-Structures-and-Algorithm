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
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        return search(k);
    }
    void inorder(TreeNode root){
        if(root == null) return ;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    private boolean search(int k ){
        int l = 0;
        int r = list.size()-1;
        while(l<r){
            int result = list.get(l) + list.get(r);
            if(k == (result)){
                return true;
            }
            else if(k>(result)){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }


}