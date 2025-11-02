package problem5;

import java.util.LinkedList;

public class BookStack {
    private LinkedList<Book> stack;

    public BookStack() {
        stack = new LinkedList<Book>();
    }

    public void push(Book book) {
        stack.addFirst(book);
    }

    public Book pop() {
        // code here and don't to test if it's empty
        System.out.println("Popped : ");
        Book b = stack.removeFirst();
        System.out.println(b);
        return b;
    }

    public Book peek() {
        // code here and don't to test if it's empty
        System.out.println("Top : ");
        Book b =stack.getFirst();
        System.out.println(b);
        return b;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents (top to bottom):");
        for(Book b : stack)
        {
            System.out.println(b);
        }
    }
}

