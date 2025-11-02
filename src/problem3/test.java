package problem3;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter library capacity: ");
        int n = sc.nextInt();
        Library library = new Library(n);
        Document d1 = new Book("Java ", "omar", 90);
        Document d2 = new Magazine("cpp", "janvier", 25);
        library.add(d1);
        library.add(d2);
        System.out.println("Library initialized with 2 documents\n");
        int choice = -1;
        while (choice != 0) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add document");
            System.out.println("2. Display all");
            System.out.println("3. Delete document");
            System.out.println("4. Search document");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            if (choice == 1)
            {
                System.out.println("enter the doc title");
                String title = sc.nextLine();
                library.add(new Document(title));
            }
            if (choice == 2)
            {
                library.displayDocuments();
            }
            if (choice == 3)
            {
                System.out.println("enter the doc title");
                String title = sc.nextLine();
                library.delete(new Document(title));
            }
            if (choice == 4)
            {
                System.out.println("enter the doc num");
                int num = sc.nextInt();
                library.document(num);
            }
        }
    }
}
