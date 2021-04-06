package iterator;

public class StackIterator<T> implements Iterator {
    private T current;
    private Stack<T> stack;

    public StackIterator(Stack<T> stack) {
        this.stack = stack;
        current = stack.top;
    }

    public boolean hasNext() {
        return current != null;
    }

    public Object next() {
        current = stack.pop();
        return current;
    }
}
