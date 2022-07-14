package Day11;

/**
 * @author timwong5
 * @date 2022-07-13 16:36
 */
class Solution {
    int maxLength;
    public int diameterOfBinaryTree(TreeNode root) {
        maxLength = 1;
        depth(root);
        return maxLength - 1;

    }

    private int depth(TreeNode node){
        if (node == null){
            return 0;
        }
        int lDepth = depth(node.left);
        int rDepth = depth(node.right);
        maxLength = Math.max(maxLength, lDepth + rDepth + 1);
        return lDepth > rDepth ? lDepth+1 : rDepth +1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}