class NodeClass {
    int value;
    NodeClass left, right;

    public NodeClass(int key) {
        value = key;
        left = right = null;
    }
}

class Tree {
    NodeClass base;

    Tree() {
        base = null;
    }

    void inOrderFunc(NodeClass node) {
        if (node == null)
            return;
        inOrderFunc(node.left);
        System.out.print(node.value + "->");
        inOrderFunc(node.right);
    }

    void PreOrderTraversal(NodeClass node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.base = new NodeClass(27);
        tree.base.left = new NodeClass(9);
        tree.base.right = new NodeClass(19);
        tree.base.left.left = new NodeClass(91);
        tree.base.left.right = new NodeClass(92);
        System.out.println("In Order traversal");
        tree.inOrderFunc(tree.base);
        tree.PreOrderTraversal(tree.base);
    }
}