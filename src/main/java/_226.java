package main.java;


import java.util.LinkedList;
import java.util.Queue;

public class _226 {

    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        root.right=left;
        root.left=right;
        return root;
    }

    public class TreeNode {
   int val;
      TreeNode left;
     TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right; }
  }

    public TreeNode invertTreeBFS(TreeNode root) {

        if(root==null)
            return null;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode current=q.poll();
            TreeNode temp=current.left;
            current.left=current.right;
            current.right=temp;

            if(current.left!=null)
                q.add(current.left);
            if(current.right!=null)
                q.add(current.right);
        }
        return root;
    }
}
