package org.example;

public class Queue {
    private ListItem head,tail;
    private int mSize;

    public Queue() {
        this.head = this.tail = null;
        this.mSize = 0;
    }

    public void push(String aData) {
        ListItem item = new ListItem();
        item.setData(aData);
        item.setNext(null);

        if (mSize == 0) {
            head = tail = item;
        } else if (mSize == 1) {
            tail = item;
            head.setNext(tail);
        } else {
            tail.setNext(item);
            tail = item;
        }

        this.mSize++;
    }

    public ListItem pop() {
        if (mSize > 0) {
            ListItem item = this.head;
            this.head = item.getNext();
            this.mSize--;
            return item;
        }
        return null;
    }

    public void printItems() {
        ListItem item = this.head;

        while (item != null) {
            System.out.println(item.getData());
            item = item.getNext();
        }
    }

    public int getSize() {
        return this.mSize;
    }
}