package Day04;


/**
 * ����ĳ��������ǰ���������������Ľ�����빹���ö���������������ڵ㡣
 * ���������ǰ���������������Ľ���ж������ظ������֡�
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

        System.out.println("��ǰ����������ֵΪ->preStart:"+preStart+" preEnd:"+preEnd+" inStart��"+inStart
                +" inEnd��"+inEnd+" index��"+index+" rootNodeValue��"+rootNodeValue);

        BinaryTreeNode node = new BinaryTreeNode();
        node.value = rootNodeValue;
        //��ǰ�ڵ���������ĸ���Ϊindex-is
        //��������Ӧ��ǰ�������λ����preOrder[ps+1,ps+index-is]
        //��������Ӧ�����������λ����inOrder[is,index-1]

        node.left = construct(preOrder, inOrder, preStart+1,
                preStart+index-inStart, inStart,index-1);
        node.right = construct(preOrder, inOrder, preStart+index-inStart+1,preEnd,
                index+1,inEnd);
        return node;

    }

    //��������ݹ��ӡ
    public void printTreeByInOreder(BinaryTreeNode node){
        if (node!=null){
            printTreeByInOreder(node.left);
            printTreeByInOreder(node.right);

        }
    }



}
