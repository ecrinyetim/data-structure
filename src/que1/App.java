package que1;

public class App {
    public static void main(String[] args) {
        LibraryTree tree = new LibraryTree();

        tree.root = tree.insert(tree.root, "Bilim Kurgu");
        tree.root = tree.insert(tree.root, "Labirent");
        tree.root = tree.insert(tree.root, "Açlık Oyunları");
        tree.root = tree.insert(tree.root, "Mevkii Uygarlığı");

        tree.alfabetik(tree.root);

        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();

        tree.delete(tree.root, "Labirent");
        System.out.println();

        tree.preOrder(tree.root);
        System.out.println();

        UsersFavorite table = new UsersFavorite(700);
        System.out.println();
        table.addUser("ECRİN", "MEVKİ UYGARLIĞI");
        table.addUser("FURKAN", "LABİRENT");
        table.addUser("HİRA", "SUÇ VE CEZA");

        table.printUsers();

    }
}
