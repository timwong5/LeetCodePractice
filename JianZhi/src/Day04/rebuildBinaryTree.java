package Day04;


/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 */
public class rebuildBinaryTree {


     //set a BinaryTree node    value: node's value   left: node's left subtree
     // right: node's right subtree

    public class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }


    public BinaryTreeNode construct(int[] preOrder, int[] inOrder, int preStart, int preEnd, int inStart,int inEnd){
        // set the root Node's Value
        int rootNodeValue = preOrder[preStart];
        // set the index as the root node which is used in the in-order construct for the BinaryTree
        int index = inStart;
        while (inOrder[index] != rootNodeValue && index < inEnd){
            index++;
        }

        System.out.println("当前各参数的数值为->preStart:"+preStart+" preEnd:"+preEnd+" inStart："+inStart
                +" inEnd："+inEnd+" index："+index+" rootNodeValue："+rootNodeValue);

        BinaryTreeNode node = new BinaryTreeNode();
        node.value = rootNodeValue;
        //当前节点的左子树的个数为index-is
        //左子树对应的前序遍历的位置在preOrder[ps+1,ps+index-is]
        //左子树对应的中序遍历的位置在inOrder[is,index-1]

        node.left = construct(preOrder, inOrder, preStart+1,
                preStart+index-inStart, inStart,index-1);
        node.right = construct(preOrder, inOrder, preStart+index-inStart+1,preEnd,
                index+1,inEnd);
        return node;

    }

    //中序遍历递归打印
    public void printTreeByInOreder(BinaryTreeNode node){
        if (node!=null){
            printTreeByInOreder(node.left);
            printTreeByInOreder(node.right);

        }
    }



}
