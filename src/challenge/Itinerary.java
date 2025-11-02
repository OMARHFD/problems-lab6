package challenge;

import java.util.Collections;
import java.util.LinkedList;

public class Itinerary {
    LinkedList<Destination> itinerary;

    public Itinerary()
    {
        this.itinerary = new LinkedList<Destination>();
    }

    public void  addDestination(Destination d)
    {
        this.itinerary.addLast(d);
        Collections.sort(itinerary, (a, b) -> Double.compare(a.getdis(), b.getdis()));
    }


}
