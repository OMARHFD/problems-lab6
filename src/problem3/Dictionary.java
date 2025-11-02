package problem3;

public class Dictionary extends Document {
    protected String language;


    public Dictionary( String title ,String language)
    {
        super( title);
        this.language=language;
    }
    @Override
    public String toString() {
        return "Dictionary{language='" + language + "}";
    }
}
