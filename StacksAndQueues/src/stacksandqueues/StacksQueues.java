package stacksandqueues;

import java.util.ArrayList;

public class StacksQueues<E> implements Stacks<E>, Queues<E> {
    
    private ArrayList<E> list;
    private int size;

    public StacksQueues() {
        list = new ArrayList<E>();
    }

    @Override
    public void push(E item) {
        list.add(item);
        size++;
    }

    @Override
    public Object peek() {
        E item;
        item = list.get(size - 1);
        
        return item;
    }

    @Override
    public E pop() {
        Object item;
        if (list.size() == 0) {
            return null;
        } else {
            size--;
            item = list.get(size);
            list.remove(size);
            return (E) item;
        }
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void enQueue(E item) {
        list.add(item);
        size++;
    }

    @Override
    public E deQueue() {
        list.remove(0);
        size--;
        return list.get(0);
    }

    @Override
    public void show() {
        for (Object o : list) {
            System.out.print(o + " ");
        }
    }
}
