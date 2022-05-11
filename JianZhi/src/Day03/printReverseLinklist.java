package Day03;


import org.w3c.dom.NodeList;

import java.util.Stack;

//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
public class printReverseLinklist {

    //  首先实现一个链表结构
    static class ListNode{
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }



    //用栈实现反转链表
    public ListNode reverseByRecursiveCall(ListNode head){
        //Stack<Integer> stack = new Stack<>();

        if (head == null || head.next == null){
             return head;
        }
        ListNode temp = head.next;
        ListNode reversedList = reverseByRecursiveCall(head.next);
        
        //结束条件 temp的next为head并且head的next为空（指已经反转完了）
        temp.next = head;
        head.next = null;

        return reversedList;


    }


    //Todo 利用遍历实现反转

    public ListNode reverseByTraversal(ListNode head){
        ListNode preNode = null;
        ListNode nextNode = null;

        /*循环过程：
        在头结点node遍历的时候此时为1结点
        next = 1结点.next(2结点)
        1结点.next=pre(null)
        pre = 1结点
        node = 2结点
        进行下一次循环node=2结点
        next = 2结点.next(3结点)
        2结点.next=pre(1结点)=>即完成2->1
        pre = 2结点
        node = 3结点
        进行循环…
        */

        while (head != null){
            //翻转过程如上述
            nextNode = head.next;
            head.next = preNode;
            preNode = head;
            head = nextNode;
        }

        return preNode;
    }



}
