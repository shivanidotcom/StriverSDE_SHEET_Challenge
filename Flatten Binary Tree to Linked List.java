public class Solution 
{
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
        // Write your code here.
        if(root==null) return null;
        TreeNode<Integer> tempLeft=root.left;
        TreeNode<Integer> tempRight=root.right;
        root.left=null;
        flattenBinaryTree(tempLeft);
        flattenBinaryTree(tempRight);
        
        root.right=tempLeft;
        TreeNode<Integer> curr=root;
        while(curr.right!=null) curr=curr.right;
        curr.right=tempRight;
        return root;
        
    }
}
