package problem3;

public class Document {
    private  static int num=0;
    protected int numRec;
    protected String title;

    public Document(String title)
    {
        this.title=title;
        this.numRec =num++;
    }

    @Override
    public String toString() {
        return "Document{numRec='" + numRec + "', title=" + title+ "}";
    }

    public int getNumRec(){return numRec;}


}


