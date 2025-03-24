package collections.queue_interface.stack_using_queue;

import java.util.LinkedList;
import java.util.Queue;

class StaQu<T> {
    Queue<T> qu;

    public StaQu() {
        this.qu = new LinkedList<>();
    }

    public void push(T data) {
        qu.add(data);
        int size = qu.size();
        for (int i = 0; i < size - 1; i++) {
            qu.add(qu.remove());
        }
    }

    public T pop() {
        if (qu.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return qu.remove();
    }

    public T peek() {
        if (qu.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return qu.peek();
    }


    public void display() {
        System.out.println("Stack elements (top to bottom): " + qu);
    }
}
