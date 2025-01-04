package que2;

import java.util.*;

public class Node {
    String name;
    ArrayList<Node> children;

    public Node(String name) {
        this.name = name;
        this.children = new ArrayList<Node>();
    }

}
