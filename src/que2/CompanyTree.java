package que2;

import java.util.*;

public class CompanyTree {
    Node root;

    public CompanyTree(Node ceo) {
        this.root = ceo;// ceo eklenir
    }

    public void addDepartmentManager(Node departmentMan, Node ceo) {

        ceo.children.add(departmentMan);
    }

    public void addEmployee(Node employee, Node departmenMan) {

        departmenMan.children.add(employee);
    }

    public void printTree() {
        printTree(root, 0); // CEO'dan başlayarak yazdırma işlemi, başlangıç derinliği 0
    }

    private void printTree(Node node, int depth) {
        if (node == null)
            return; // Null node kontrolü

        // Her seviyede derinliğe bağlı olarak girinti eklenir
        String indent = "  ".repeat(depth); // Depth kadar boşluk ekler

        // Mevcut node'un adını yazdır
        System.out.println(indent + node.name);

        // Çocuklarını yazdırmak için her bir çocuk üzerinde aynı işlemi yap
        for (Node child : node.children) {
            printTree(child, depth + 1); // Çocuk için derinlik arttırılır
        }
    }

    Node findDepartmen(Node employee, CompanyTree company) {

        Iterator<Node> iterator = company.root.children.iterator();
        while (iterator.hasNext()) {
            Node item = iterator.next();
            if (item.children.contains(employee)) {
                return item;
            }
        }
        return null;

    }

}
