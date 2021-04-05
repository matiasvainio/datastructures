package org.example;

public class ListItem {
    private String mData;
    private ListItem mNext;

    public ListItem() {
        mNext = null;
    }

    public ListItem getNext() {
        return mNext;
    }

    public void setNext(ListItem mNext) {
        this.mNext = mNext;
    }

    public String getData() {
        return mData;
    }

    public void setData(String mData) {
        this.mData = mData;
    }
}
