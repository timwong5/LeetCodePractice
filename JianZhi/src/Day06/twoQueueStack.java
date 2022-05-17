package Day06;

import java.util.LinkedList;
import java.util.Queue;

public class twoQueueStack {


    private static Queue<Object> queue1 = new LinkedList<Object>();
    private static Queue<Object> queue2 = new LinkedList<Object>();


    //���ջ�Ƿ�Ϊ��

    public boolean isEmpty(){
        return queue1.isEmpty() && queue2.isEmpty();
    }

    //push ���� Queue �� add() �� offer()����������������һ��Ԫ�ء�
    //����������������£�add() �������׳�IllegalStateException�쳣��offer() ����ֻ�᷵�� false
    public  void push(Object item){
        //ѹ��һ��Ԫ��a �޶����� ���ն�����ѹ��Ԫ��
        if (queue1.isEmpty()){
            queue1.offer(item);
        }

        else queue2.offer(item);
    }

    //pop ���� Queue �� remove() �� poll()���������Ӷ���ͷ��ɾ��һ��Ԫ�ء�
    //�ڶ���Ԫ��Ϊ�յ�����£�remove() �������׳�NoSuchElementException�쳣��poll() ����ֻ�᷵�� null
    public void pop(Object item){
        //ջ�ĺ���ȳ�ԭ�� ���ѹ���Ԫ�����ȵ���
        //���һ��Ԫ��λ�ڶ���β�� ���е�ɾ��ֻ�ܴ�ͷ�� ��������Ҫ����ɾ��ǰ���Ԫ��
        //������ɾ����Ԫ�ز���queue2 ����queue1��ɾ������Ҫ��Ԫ��

        if (!isEmpty()){
            if (queue2.isEmpty()) {
                while (queue1.size() > 1) {
                    queue2.offer(queue1.poll());
                }

                System.out.println("��ջԪ��Ϊ��"+ queue1.poll());
            }


            if (queue1.isEmpty()){
                while (queue2.size() > 1){
                    queue1.offer(queue2.poll());
                }

                System.out.println("��ջԪ��Ϊ��"+ queue2.poll());
            }

            //�������ԵĲ��Ϸ�����������ͨ��throw�����׳��쳣
            else throw new RuntimeException("ջΪ�գ��޷�ִ�г�ջ����");

        }
    }



}
