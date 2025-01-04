package que3;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Node anaKlasor = new Node("Klasor A");

        FolderTree mainFolder = new FolderTree(anaKlasor);

        Node altKlasor = new Node("Klasor B");

        mainFolder.altKlasor(altKlasor);

        Node dosya = new Node("Dosya A");

        mainFolder.altKlasorDosya(altKlasor, dosya);

        // mainFolder.printTree();

        mainFolder.klasorListele(anaKlasor);

    }

}
