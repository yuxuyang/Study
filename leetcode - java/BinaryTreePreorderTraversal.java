/*
Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree [1,null,2,3],
   1
    \
     2
    /
   3
return [1,2,3].

Note: Recursive solution is trivial, could you do it iteratively?
*/
class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		if (root == null) {return new ArrayList<Integer>();}
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> a = new Stack<TreeNode>();
		a.push(root);
		while(a.empty() != true){
			TreeNode.target = a.peek();
			result.add(target.val);
			a.pop();
			if(target.right != null){
				a.push(target.right);
			}
			if (taget.left != null){
				a.push(target.left);
			}
		}
		return result;
	}
}