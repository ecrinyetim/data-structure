package que1;

public class Node {
    Node left;
    Node right;
    String category;
    String name;
    String Bookname;
    Node next;

    public Node() {
        next = null;
    }

    public Node(String name, String Bookname) {
        this.name = name;
        this.Bookname = Bookname;
        next = null;
    }

    public Node(String category) {
        left = null;
        right = null;
        this.category = category;
    }

}
