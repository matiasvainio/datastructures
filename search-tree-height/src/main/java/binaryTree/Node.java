package binaryTree;

import java.util.Objects;

public class Node {
    private int data, height;
    private Node left, right;

    public Node(int data) {
        this.data = data;
        height = 0;
    }

    public void insert(int value) {
        // Ei hyväksytä duplikaatteja.
        if (value == data) {
            return;
        }

        if (value < data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }

        // Jos ei löydy lapsisolmuja lisätään korkeutta.
        // Muuten valitaan kahden alipuun korkeuksista toinen ja lisätään siihen 1.
        if (left != null && right != null) {
            height = Math.max(right.getHeight(), left.getHeight()) + 1;
        } else {
            height++;
        }
    }

    public void inOrder() {
        if (left != null) {
            left.inOrder();
        }
        System.out.println(data + " " + height + ", ");
        if (right != null) {
            right.inOrder();
        }
    }

    public Node get(int value) {
        if (value == data) {
            return this;
        }
        if (value < data) {
            if (left != null) {
                return left.get(value);
            }
        } else {
            if (right != null) {
                return right.get(value);
            }
        }
        return null;
    }

    // Apumetodi suurimman solmun löytämiseksi.
    public int max() {
        if (left == null) {
            return data;
        } else {
            return right.max();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setHeight() {
        this.height++;
    }

    public int getHeight() {
        return this.height;
    }

}