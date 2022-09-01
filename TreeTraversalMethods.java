
class NodeClasss {
    public int data;
    public NodeClasss left;
    public NodeClasss right;

    public NodeClasss(int item) {
        data = item;
        left = right = null;
    }
}

class TreeTraversal {
    NodeClasss root;

    TreeTraversal() {
        root = null;

    }

    void PreOrderTraversal(NodeClasss root2) {
        if (root2 == null)
            return;
        System.out.print(root2.data + " ");
        PreOrderTraversal(root2.left);
        PreOrderTraversal(root2.right);
    }

    void InOrderTraversal(NodeClasss root2) {
    if (root2 == null)
    return;
    InOrderTraversal(root2.left);
    System.out.print(root2.data + " ");
    InOrderTraversal(root2.right);
    }

    void PostOrderTraversal(NodeClasss node) {
        if (node == null)
            return;
        PostOrderTraversal(node.left);
        PostOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    int HeightOfTree(NodeClasss node) {
        if (node == null)
            return -1;
        else {
            int left = HeightOfTree(node.left);
            int right = HeightOfTree(node.right);
            if (left > right)
                return left + 1;
            else
                return right + 1;
        }
    }

    int SizeOfTree(NodeClasss node) {
        if (node == null)
            return 0;
        else {
            int left = SizeOfTree(node.left);
            int right = SizeOfTree(node.right);
            return (left + right + 1);
            // return (SizeOfTree(node.left)+SizeOfTree(node.right)+1);
        }
    }
}

public class TreeTraversalMethods {
    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new NodeClasss(1);
        tree.root.left = new NodeClasss(2);
        tree.root.right = new NodeClasss(3);
        tree.root.left.left = new NodeClasss(4);
        tree.root.left.right = new NodeClasss(5);
        tree.root.right.left = new NodeClasss(6);
        tree.root.right.right = new NodeClasss(7);
        System.out.println("Pre-Order Traversal is: ");
        tree.PreOrderTraversal(tree.root);
        System.out.println("\n");
        System.out.println("In-order Traversal is: ");
        tree.InOrderTraversal(tree.root);

    }
}
