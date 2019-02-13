package stacksandqueues;

public interface Stacks<E> {
    public void push(E item);
    public Object peek();
    public E pop();
    public int size();
    public boolean isEmpty();
    public void show();
}
