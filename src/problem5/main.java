package problem5;

public class main {
    public static void main (String[] args)
    {
        System.out.println("=== Stack test ===");
        BookStack stack = new BookStack();
        Book b1=new Book("Clean Code" , "Robert C. Martin" , 2008);
        Book b2=new Book("1984 " , "George Orwell" , 1949);
        Book b3=new Book("the Hobbit" , " J.R.R. Tolkien" , 1937);
        stack.push(b3);
        stack.push(b2);
        stack.push(b1);
        stack.display();
        stack.pop();
        stack.peek();
        stack.display();
        System.out.println("=== Queue test ===");
        BookQueue queue = new BookQueue();
        queue.enqueue(b3);
        queue.enqueue(b2);
        queue.enqueue(b1);
        queue.display();
        queue.dequeue();
        queue.peek();
        queue.display();

    }
}
