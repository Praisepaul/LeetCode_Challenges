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
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;

        while (current != null) {
            if (current.left == null) {
                result.add(current.val);
                current = current.right;
            } else {
                TreeNode left = current.left;
                while (left.right != null && left.right != current) {
                    left = left.right;
                }

                if (left.right == null) {
                    left.right = current;
                    current = current.left;
                } else { 
                    left.right = null;
                    result.add(current.val);
                    current = current.right;
                }
            }
        }

        return result;
    }
}
