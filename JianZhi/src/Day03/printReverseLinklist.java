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
    public ListNode reverseByRecursiveCall(ListNode head){
        //Stack<Integer> stack = new Stack<>();

        if (head == null || head.next == null){
             return head;
        }
        ListNode temp = head.next;
        ListNode reversedList = reverseByRecursiveCall(head.next);
        
        //�������� temp��nextΪhead����head��nextΪ�գ�ָ�Ѿ���ת���ˣ�
        temp.next = head;
        head.next = null;

        return reversedList;


    }


    //Todo ���ñ���ʵ�ַ�ת

    public ListNode reverseByTraversal(ListNode head){
        ListNode preNode = null;
        ListNode nextNode = null;

        /*ѭ�����̣�
        ��ͷ���node������ʱ���ʱΪ1���
        next = 1���.next(2���)
        1���.next=pre(null)
        pre = 1���
        node = 2���
        ������һ��ѭ��node=2���
        next = 2���.next(3���)
        2���.next=pre(1���)=>�����2->1
        pre = 2���
        node = 3���
        ����ѭ����
        */

        while (head != null){
            //��ת����������
            nextNode = head.next;
            head.next = preNode;
            preNode = head;
            head = nextNode;
        }

        return preNode;
    }



}
