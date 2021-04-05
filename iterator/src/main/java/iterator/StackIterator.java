package iterator;

public class StackIterator<T> {
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
        Object o = current;
        stack.pop();
        current = stack.top;
        return o;
    }

    @Override
    public String toString() {
        return "StackIterator{" +
                "current=" + current +
                ", stack=" + stack +
                '}';
    }
}
