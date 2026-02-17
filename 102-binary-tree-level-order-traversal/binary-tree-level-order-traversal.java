class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return ans;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> li=new ArrayList<>(size);
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                li.add(temp.val);
            }
            ans.add(li);
        }
        return ans;
    }
}