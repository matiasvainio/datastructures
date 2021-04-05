package iterator;

import java.util.Arrays;

public class Stack<T> {
    T top;
    int i, size, last;
    Object[] a = new Object[3];

    public Stack() {
        top = null;
        i = size = last = 0;
    }

    public void push(T o) {
        if (size == a.length) {
            a = Arrays.copyOf(a, size + 3);
        }
        a[size] = o;
        size++;
        last = size - 1;
        top = (T) a[last];
    }

    public T pop() {
        if (size > 0) {
            T t = top;
            size--;
            if (last > 0) {
                top = (T) a[last - 1];
            }
            last = size - 1;
            return t;
        }
        return null;
    }

    public int getSize() {
        return this.size;
    }

    public StackIterator<T> iterator() {
        return new StackIterator<>(this);
    }

    public void printItems() {
        for (int i = last; i > -1; i--) {
            System.out.println(a[i]);
        }
    }
}
