//给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其层序遍历: 
//
// [
//     [1],
//     [3,2,4],
//     [5,6]
//]
// 
//
// 
//
// 说明: 
//
// 
// 树的深度不会超过 1000。 
// 树的节点总数不会超过 5000。 
// Related Topics 树 广度优先搜索 
// 👍 109 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class Solution {
    public List<List<Integer>> levelOrder(Node root) {

        //广度优先，维护一个队列
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<Node>();
        if(root == null){
            return res;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++){
                Node nextNode = queue.poll();
                level.add(nextNode.val);
                //将此时跟节点的所有子节点加入队列
                queue.addAll(nextNode.children);
            }
            res.add(level);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
