/*
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,3,2].

Note: Recursive solution is trivial, could you do it iteratively?
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
  }
*/


class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {return new ArrayList<Integer>();}
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> a = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null ){
            a.push(node);
            node = node.left;
        }
        while (!a.empty()){
            node = a.pop();
            result.add(node.val);
            if(node.right != null){
                node = node.right;
                
                while(node != null){
                    a.push(node);
                    node = node.left;
                }
            }
            
        }
        return result;
    }

	public List<Integer> inorderTraversal2(TreeNode root) {
    List<Integer> list = new ArrayList<Integer>();

    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode cur = root;

    while(cur!=null || !stack.empty()){
        while(cur!=null){
            stack.add(cur);
            cur = cur.left;
        }
        cur = stack.pop();
        list.add(cur.val);
        cur = cur.right;
    }

    return list;
	}
}