
class BstMethods {
    Node root;

    BstMethods() {
        root = null;
    }

    void add(int key) {
        root = addBstNode(root, key);
    }

    Node addBstNode(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
        if (key < node.data) {
            node.left = addBstNode(node.left, key);
        } else if (key > node.data) {
            node.right = addBstNode(node.right, key);
        }
        return node;
    }

    void PreOrderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }

    int minNode(Node node) {
        if (node.left == null)
            return node.data;
        else
            return minNode(node.left);
    }

    int maxNode(Node node) {
        if (node.right == null)
            return node.data;
        else
            return maxNode(node.right);
    }

    void search(int key) {
        Node node = searchKey(root, key);
        if (node != null)
            System.out.println("Data value " + key + " found");
        else
            System.out.println("Data value " + key + " not found");
    }

    Node searchKey(Node node, int key) {
        if (node == null || node.data == key)
            return node;
        if (key < node.data)
            return searchKey(node.left, key);
        else
            return searchKey(node.right, key);
    }

    void delete(int key) {
        root = deleteNode(root, key);
    }

    Node deleteNode(Node node, int key) {
        if (node == null)
            return node;
        if (key < node.data)
            node.left = deleteNode(node.left, key);
        else if (key > node.data)
            node.right = deleteNode(node.right, key);
        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;
            node.data = minValue(node.right);
            node.right = deleteNode(node.right, node.data);
        }
        return node;
    }

    int minValue(Node node) {
        int minVal = node.data;
        while (node.left != null) {
            minVal = node.left.data;
            node = node.left;
        }
        return minVal;
    }

    int rangeSumBST(Node node, int L, int H) {
        if (node == null)
            return 0;
        if (node.data >= L && node.data <= H)
            return node.data + rangeSumBST(node.left, L, H) + rangeSumBST(node.right, L, H);
        else if (node.data < L)
            return rangeSumBST(node.right, L, H);
        else
            return rangeSumBST(node.left, L, H);
    }
}

public class BSTMainOperation {
    public static void main(String[] args) {
        BstMethods tree = new BstMethods();
        tree.add(50);
        tree.add(25);
        tree.add(15);
        tree.add(75);
        tree.add(30);
        tree.add(70);
        tree.add(85);
        tree.add(10);
        tree.add(23);
        tree.add(46);
        tree.add(84);
        tree.add(90);
        System.out.println("PreOrder Traversal of that tree is");
        tree.PreOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Maximum Node in this Tree is:");
        System.out.println(tree.maxNode(tree.root));
        System.out.println("Minimum Node in this Tree is:");
        System.out.println(tree.minNode(tree.root));
        tree.search(30);
        tree.delete(90);
        System.out.println("PreOrder Traversal of that tree after deletation is");
        tree.PreOrderTraversal(tree.root);
        System.out.println();
        System.out.println("The sum of the tree between 23 and 75 is");
        System.out.println(tree.rangeSumBST(tree.root, 23, 75));
    }
}
