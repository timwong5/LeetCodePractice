package Day06;

import java.util.LinkedList;
import java.util.Queue;

public class twoQueueStack {


    private static Queue<Object> queue1 = new LinkedList<Object>();
    private static Queue<Object> queue2 = new LinkedList<Object>();


    //检查栈是否为空

    public boolean isEmpty(){
        return queue1.isEmpty() && queue2.isEmpty();
    }

    //push 操作 Queue 中 add() 和 offer()都是用来向队列添加一个元素。
    //在容量已满的情况下，add() 方法会抛出IllegalStateException异常，offer() 方法只会返回 false
    public  void push(Object item){
        //压入一个元素a 限定条件 往空队列中压入元素
        if (queue1.isEmpty()){
            queue1.offer(item);
        }

        else queue2.offer(item);
    }

    //pop 操作 Queue 中 remove() 和 poll()都是用来从队列头部删除一个元素。
    //在队列元素为空的情况下，remove() 方法会抛出NoSuchElementException异常，poll() 方法只会返回 null
    public void pop(Object item){
        //栈的后进先出原则 最后被压入的元素最先弹出
        //最后一个元素位于队列尾部 队列的删除只能从头部 所以我们要依次删除前面的元素
        //接下来删除的元素插入queue2 最后从queue1中删除所需要的元素

        if (!isEmpty()){
            if (queue2.isEmpty()) {
                while (queue1.size() > 1) {
                    queue2.offer(queue1.poll());
                }

                System.out.println("出栈元素为："+ queue1.poll());
            }


            if (queue1.isEmpty()){
                while (queue2.size() > 1){
                    queue1.offer(queue2.poll());
                }

                System.out.println("出栈元素为："+ queue2.poll());
            }

            //对于明显的不合法操作，可以通过throw主动抛出异常
            else throw new RuntimeException("栈为空，无法执行出栈操作");

        }
    }



}
