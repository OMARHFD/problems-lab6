package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> Documents = new ArrayList<>();

    public Library(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Library{capacity='" + capacity + "}";
    }

    void displayDocuments() {
        System.out.println("-----------------------------------------------");
        System.out.println("Documents of this library are :");
        for (Document doc : Documents) {
            System.out.println(doc);
        }
        System.out.println("-----------------------------------------------");

    }

    boolean add(Document doc) {
        if (Documents.contains(doc)) {
            return false;
        }
        if (Documents.size() < capacity) {
            Documents.set(Documents.size() - 1, doc);
            return true;
        }
        return false;
    }

    boolean delete(Document doc) {
        if (Documents.contains(doc)) {
            Documents.remove(Documents.indexOf(doc));
            return true;
        }
        return false;
    }

    Document document(int numEnrg) {
        for (Document doc : Documents) {
            if (doc.getNumRec() == numEnrg) {
                return doc;
            }
        }
        return null;
    }


    void displayAuthors() {
        for (Document doc : Documents) {
            if (doc instanceof Book) {
                ((Book) doc).displayAuthor();
            }
        }
    }

}
