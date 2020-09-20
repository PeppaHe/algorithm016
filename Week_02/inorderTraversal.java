

import java.util.ArrayList;
import java.util.Stack;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        //递归
//        List<Integer> res = new ArrayList<>();
//        inOrder(root,res);
//        return res;
//    }
//    public void inOrder(TreeNode root, List<Integer> res){
//        if (root == null){
//            return;
//        }
//        inOrder(root.left, res);
//        res.add(root.val);
//        inOrder(root.right, res);

        //维护一个栈
//        List<Integer> res = new ArrayList<Integer>();
//        Deque<TreeNode> stk = new LinkedList<TreeNode>();
//        while (root != null || !stk.isEmpty()) {
//            while (root != null) {
//                stk.push(root);
//                root = root.left;
//            }
//            root = stk.pop();
//            res.add(root.val);
//            root = root.right;
//        }
//        return res;


    }
}
