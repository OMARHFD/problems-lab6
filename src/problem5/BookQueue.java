package problem5;

import java.util.LinkedList;

public class BookQueue {
    LinkedList<Book> bookQueue = new LinkedList<Book> ();
    public BookQueue() {
        bookQueue = new LinkedList<Book>();
    }


    void enqueue(Book b)
    {
        bookQueue.addLast(b);
    }
    Book dequeue()
    {
        Book b = bookQueue.removeFirst() ;
        System.out.println("Dequeued : ");
        System.out.println(b);
        return b;
    }
    Book peek()
    {
        System.out.println("Front : ");
        System.out.println(bookQueue.getFirst());
       return bookQueue.getFirst();
    }

    public void display() {
        System.out.println("Queue contents (front to back)");
        for(Book b : bookQueue)
        {
            System.out.println(b);
        }
    }
}
