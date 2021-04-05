package org.example;

public class Stack {
    private ListItem mTop;
    private int mSize;

    public Stack() {
        this.mTop = null;
        this.mSize = 0;
    }

    public void push(String aData) {
        ListItem item = new ListItem();
        item.setNext(this.mTop);
        item.setData(aData);
        this.mTop = item;
        this.mSize++;
    }

    public ListItem pop() {
        if (mSize > 0) {
            ListItem item;
            item = this.mTop;
            this.mTop = item.getNext();
            this.mSize--;
            return item;
        }
        return null;
    }

    public void printItems() {
        ListItem item = this.mTop;

        while (item != null) {
            System.out.println(item.getData());
            item = item.getNext();
        }
    }

    public int getSize() {
        return this.mSize;
    }

}
