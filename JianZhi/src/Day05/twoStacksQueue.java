package Day05;


//������ջʵ��һ�����С����е��������£���ʵ�������������� appendTail �� deleteHead ��
// �ֱ�����ڶ���β�������������ڶ���ͷ��ɾ�������Ĺ��ܡ�(��������û��Ԫ�أ�deleteHead�������� -1 )

import java.util.Stack;

public class twoStacksQueue {

    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();


    public void appendTail(int value){
        s1.push(value);
    }


    /**
     * ����s2Ϊ����ջ s1����Ŷ��е�Ԫ�� �������s2Ϊ�� ��s1��Ԫ��ȫ��ѹ��s2�� �ٽ���pop
     * ���s2��Ϊ�� ��s2��Ԫ�ؽ���pop
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
