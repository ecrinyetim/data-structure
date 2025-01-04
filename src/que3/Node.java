package que3;

import java.util.*;

import java.util.ArrayList;

public class Node {
    String folderName;
    ArrayList<Node> children;

    public Node(String folderName) {
        this.folderName = folderName;
        this.children = new ArrayList<>();
    }

}
