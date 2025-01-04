package que3;

import java.util.*;
import java.util.Iterator;

public class FolderTree {
    Node root;

    public FolderTree(Node root) {
        this.root = root;
    }

    void altKlasor(Node file) {

        root.children.add(file);
    }

    void altKlasorDosya(Node altKlasor, Node dosya) {

        altKlasor.children.add(dosya);
    }

    void klasorListele(Node root) {
        Iterator<Node> iterator = root.children.iterator();

        while (iterator.hasNext()) {
            Node item = iterator.next();
            System.out.println("Alt Klasörleri: " + item.folderName);
            Iterator<Node> iterator2 = item.children.iterator();
            while (iterator2.hasNext()) {
                Node item2 = iterator2.next();
                System.out.println("Alt Dosyaları: " + item2.folderName);
            }
        }
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
        System.out.println(indent + node.folderName);

        // Çocuklarını yazdırmak için her bir çocuk üzerinde aynı işlemi yap
        for (Node child : node.children) {
            printTree(child, depth + 1); // Çocuk için derinlik arttırılır
        }
    }

}
