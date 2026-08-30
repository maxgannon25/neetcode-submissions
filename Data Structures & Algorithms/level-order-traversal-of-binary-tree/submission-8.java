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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        Queue<TreeNode> q = new ArrayDeque();
        List<Integer> levelList = new ArrayList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            for (int i=0; i < levelSize; i++){
                TreeNode cur = q.remove();
                levelList.add(cur.val);

                if (cur.left != null){
                    q.offer(cur.left);
                }

                if (cur.right != null){
                    q.offer(cur.right);
                }
            }
            result.add(levelList);
            levelList = new ArrayList();  
        }

        return result;
    }
}
