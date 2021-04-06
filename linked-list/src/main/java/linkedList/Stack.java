package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack {
    private final LinkedList<String> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(String s) {
        list.addLast(s);
    }

    public String pop() {
        if (list.size() > 0) {
            return list.removeLast();
        }
        return null;
    }

    public int getSize() {
        return list.size();
    }

    public void printItems() {
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

//        Yllä oleva on sama kuin seuraava:

//        for (String s : list) {
//            System.out.println(s);
//        }
    }
}
