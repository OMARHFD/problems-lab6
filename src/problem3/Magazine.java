package problem3;

public class Magazine extends Document {
    protected String month;
    protected int year;

    public Magazine( String title ,String month , int year)
    {
        super( title);
        this.year=year;
        this.month=month;
    }
    @Override
    public String toString() {
        return "Magazine{month='" + month + "', year=" + year + "}";
    }

}
