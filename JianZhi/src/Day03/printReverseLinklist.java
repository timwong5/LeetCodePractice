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
    public ListNode reverse(ListNode head){
        //Stack<Integer> stack = new Stack<>();

        if (head == null || head.next == null){
             return head;
        }
        ListNode temp = head.next;
        ListNode reversedList = reverse(head.next);
        
        //结束条件 temp的next为head并且head的next为空（指已经反转完了）
        temp.next = head;
        head.next = null;

        return reversedList;


    }


    //Todo 利用遍历实现反转
}
