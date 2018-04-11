public class ConstructStringFromBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
        public String tree2str(TreeNode t) {
            StringBuilder a = new StringBuilder();
            getString(t, a);
            return a.toString();
        }

        public void getString(TreeNode root, StringBuilder builder ){
            if (root == null)
            {
                return;
            } else {
                if(root.left != null || root.right != null){
                    builder.append("(");
                    getString(root.left, builder);
                    builder.append(")");
                    if(root.right != null){
                        builder.append("(");
                        getString(root.right, builder);
                        builder.append(")");
                    }
                }
            }
        }
}
