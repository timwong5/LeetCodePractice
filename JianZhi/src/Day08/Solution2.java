package Day08;

public class Solution2 {

    /**
     * 设定所有的节点和sum 再设分割后的
     * @param root
     * @return
     */
    public int maxProduct(TreeNode root) {
        int nodeVal = 0;
        int total = 0;


//        public long getTotal(TreeNode root){
//
//        }




        int result = (nodeVal * (total-nodeVal)) % (1000000000 + 7);
        return result;

    }
}
