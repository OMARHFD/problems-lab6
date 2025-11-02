package challenge;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public  static void main(String[] args)
    {
        LinkedList<Destination> itinerary = new LinkedList<Destination>();
        itinerary.add(new Destination("Adelaide", 1374.0));
        itinerary.add(new Destination("Alice Springs", 2771.0));
        itinerary.add(new Destination("Sidney", 0.0));
        itinerary.add(new Destination("Brisbane", 917.0));
        itinerary.add(new Destination("Darwin", 3972.0));
        itinerary.add(new Destination("Milbourne", 877.0));
        itinerary.add(new Destination("Pertch", 3923.0));

        Collections.sort(itinerary, (a, b) -> Double.compare(a.getdis(), b.getdis()));
        Scanner sc = new Scanner(System.in);
        System.out.println("" +
                "(F)orward" +
                "(B)ackward" +
                "(L)ist Places" +
                "(M)enu" +
                "(Q)uit");

        String input = sc.nextLine();
        var iterator=itinerary.listIterator();
        String lastDirection="For";

        while(!input.equals("Q"))
        {
            if (input.equals("F"))
            {
                if (!iterator.hasNext()) {
                    System.out.println("End of list");
                } else {
                    if (!lastDirection.equals("For") && iterator.hasNext()) {
                        iterator.next();
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                        lastDirection = "For";
                    }
                }
            }
            else if (input.equals("B"))
            {
                if (!iterator.hasPrevious()) {
                    System.out.println("Start of list");
                } else {
                    if (!lastDirection.equals("Bac") && iterator.hasPrevious()) {
                        iterator.previous();
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                        lastDirection = "Bac";
                    }
                }
            }
            else if (input.equals("L"))
            {
                System.out.println("Itinerary:");
                for (Destination d : itinerary) {
                    System.out.println(d);
                }
            }
            else if (input.equals("M"))
            {
                System.out.println("(F)orward\n(B)ackward\n(L)ist Places\n(M)enu\n(Q)uit");
            }

            input = sc.nextLine(); // Read next input
        }

    }

}
