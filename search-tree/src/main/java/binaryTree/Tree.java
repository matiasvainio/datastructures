package binaryTree;

public class Tree {
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.insert(value);
        }
    }

    public void inOrder() {
        if (root != null) {
            root.inOrder();
        }
    }

    public Node get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private Node delete(Node subRoot, int value) {
        // Poistuu rekursiosta
        if (subRoot == null) {
            return subRoot;
        }
        // Edetään puuta pitkin.
        if (value < subRoot.getData()) {
            subRoot.setLeft(delete(subRoot.getLeft(), value));
        } else if (value > subRoot.getData()) {
            subRoot.setRight(delete(subRoot.getRight(), value));
        } else {
            // Tapaukset 1, 2.
            if (subRoot.getLeft() == null) {
                return subRoot.getRight();
            } else if (subRoot.getRight() == null) {
                return subRoot.getLeft();
            }

            // 3. tapaus.
            subRoot.setData(subRoot.getLeft().max());

            subRoot.setLeft(delete(subRoot.getLeft(), subRoot.getData()));

        }
        return subRoot;
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }
}
