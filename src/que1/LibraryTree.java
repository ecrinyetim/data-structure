package que1;

import java.util.*;

public class LibraryTree {
    Node root;

    public LibraryTree() {
        root = null;
    }

    Node newNode(String category) {
        return new Node(category);
    }

    Node insert(Node root, String category) {
        if (root != null) {
            if (root.category.compareTo(category) < 0) {
                root.left = insert(root.left, category);
            } else
                root.right = insert(root.right, category);
        } else
            root = newNode(category);
        return root;
    }

    Node delete(Node root, String category) {

        Node t1, t2;
        if (root == null) {
            return null;
        }
        if (root.category == category) {
            if (root.left == root.right) {
                root = null;
                return null;
            } else if (root.right == null) {
                t1 = root.left;
                return t1;
            } else if (root.left == null) {
                t1 = root.right;
                return t1;
            } else {
                t1 = t2 = root.right;
                while (t1.left != null) {
                    t1 = t1.left;
                }
                t1.left = root.left;

                return t2;
            }
        } else {
            if (root.category.compareTo(category) < 0) {
                root.left = delete(root.left, category);
            } else {
                root.right = delete(root.right, category);

            }
            return root;

        }

    }

    int size(Node root) {

        if (root == null)
            return 0;

        else {
            return size(root.left) + 1 + size(root.right);

        }

    }

    void preOrder(Node root) {

        if (root != null) {
            System.out.print(root.category + "  ");
            preOrder(root.left);
            preOrder(root.right);

        }
    }

    void inOrder(Node root) {

        if (root != null) {
            inOrder(root.left);
            System.out.print(root.category + "  ");
            inOrder(root.right);

        }
    }

    void postOrder(Node root) {

        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.category + "  ");
        }
    }

    public static void ekleArray(Node root, ArrayList<Node> NodeList) {
        if (root != null) {
            ekleArray(root.left, NodeList);
            NodeList.add(root);
            ekleArray(root.right, NodeList);
        }
    }

    public static void alfabetik(Node root) {

        ArrayList<Node> nodeList = new ArrayList<Node>();
        ekleArray(root, nodeList);

        int n = nodeList.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nodeList.get(j).category.compareTo(nodeList.get(j + 1).category) > 0) {
                    Node gecici = nodeList.get(j);
                    nodeList.set(j, nodeList.get(j + 1));
                    nodeList.set(j + 1, gecici);
                }
            }
        }

        for (Node node : nodeList) {
            System.out.println(node.category);
        }
    }

}
