public class MinimumAbsoluteDifferenceBST {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
    TreeNode prev = null;
    int minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return Integer.MAX_VALUE;
        }
        getMinimumDifference(root.left);
       
        if(prev != null){
            minDiff = Math.min(minDiff,Math.abs(prev.val - root.val));
        }
        prev = root;
        
        getMinimumDifference(root.right);

        return minDiff;
    }
}
