package Day03;


import org.w3c.dom.NodeList;

import java.util.Stack;

//����һ�������ͷ�ڵ㣬��β��ͷ����������ÿ���ڵ��ֵ�������鷵�أ�
public class printReverseLinklist {

    //  ����ʵ��һ������ṹ
    static class ListNode{
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }



    //��ջʵ�ַ�ת����
    public ListNode reverse(ListNode head){
        //Stack<Integer> stack = new Stack<>();

        if (head == null || head.next == null){
             return head;
        }
        ListNode temp = head.next;
        ListNode reversedList = reverse(head.next);
        
        //�������� temp��nextΪhead����head��nextΪ�գ�ָ�Ѿ���ת���ˣ�
        temp.next = head;
        head.next = null;

        return reversedList;


    }


    //Todo ���ñ���ʵ�ַ�ת
}
