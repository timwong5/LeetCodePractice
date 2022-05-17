package Day05;


//用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
// 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead操作返回 -1 )

import java.util.Stack;

public class twoStacksQueue {

    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();


    public void appendTail(int value){
        s1.push(value);
    }


    /**
     * 设置s2为辅助栈 s1存放着队列的元素 其中如果s2为空 则将s1的元素全部压入s2中 再进行pop
     * 如果s2不为空 则将s2的元素进行pop
     *
     * @return s2.pop
     */
    public int deleteHead(){
        if (s1.empty()){
            return -1;
        }
        while (!s1.empty()){
            if (s2.empty()){
                int value = s1.pop();
                s2.push(value);
            }

        }

        return s2.pop();

    }

}
