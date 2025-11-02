package problem3;

public class Book extends Document {
    protected String author;
    protected int nbrPages;

    public Book( String title ,String author , int nbrPages)
    {
        super( title);
        this.author=author;
        this.nbrPages=nbrPages;
    }
    @Override
    public String toString() {
        return "BOOK{Author='" + author + "', nbrPages=" + nbrPages + "}";
    }

    void displayAuthor()
    {
        System.out.println(author);
    }

}
