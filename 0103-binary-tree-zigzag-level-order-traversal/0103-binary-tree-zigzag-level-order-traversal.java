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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return res;
        q.offer(root);
        boolean f=true;
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                list.add(temp.val);
                if(temp.left!=null)
                   q.offer(temp.left);
                if(temp.right!=null)
                   q.offer(temp.right);
            }
            if(f)
            res.add(list);
            else
           {
            Collections.reverse(list);
                res.add(list);
           }
            f=!f;
        }
        return res;
    }
}