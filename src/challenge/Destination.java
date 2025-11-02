package challenge;

public class Destination {
    String name;
    Double distance;

    public Destination(String name , Double distance)
    {
        this.name=name;
        this.distance=distance;
    }

    public Double getdis()
    {
        return  this.distance;
    }

    @Override
    public String toString() {
        return "name : "+name+"| distance: "+distance;
    }
}
