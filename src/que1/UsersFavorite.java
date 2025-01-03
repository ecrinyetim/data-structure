package que1;

public class UsersFavorite {
    Node dizi[];
    int size;

    public UsersFavorite(int size) {
        this.size = size;
        dizi = new Node[size];
    }

    void addUser(String name, String Bookname) {
        Node eleman = new Node(name, Bookname);

        for (int i = 0; i < size; i++) {
            if (dizi[i] == null) {
                dizi[i] = eleman;
                break;
            }
        }
    }

    void printUsers() {
        System.out.println("Users in the list:");
        for (int i = 0; i < size; i++) {
            if (dizi[i] != null) {
                System.out.println((i + 1) + ". Kişi: " + dizi[i].name + ", Favori Kitabı = " + dizi[i].Bookname);
            }
        }
    }

}
