package stacksandqueues;

public interface Queues<E> {
    public void enQueue(E item);
    public E deQueue();
    public int size();
    public boolean isEmpty();
    public void show();
}
