package problem4;

import java.util.*;

public class ListPerformanceComparison {

    private static final int SIZE = 100_000;        // total elements
    private static final int OPERATIONS = 10_000;   // random operations to test

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        System.out.println("---- Performance Comparison ----");

        System.out.println("---- Populate both lists ----");
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // 2️⃣ Random insertions and deletions
        testRandomInsertDelete(arrayList, "ArrayList");
        testRandomInsertDelete(linkedList, "LinkedList");
        //linkeLists win because once the element at the wanted index reached
        //we just remerge elements but for the case of arraylists , elements are
        //contigouisly stored in the memory so all of the previous or next
        //elements of the one inserted or deleted are shiftedby either +1 or
        //-1 in their indexes

        // 3️⃣ Sequential insertions/deletions at beginning and end
        testSequentialInsertDelete(arrayList, "ArrayList");
        testSequentialInsertDelete(linkedList, "LinkedList");

        //again linkedlists win for the same previous reason , here each time
        // we insert from beginnig or end of the lnkedlist we just have to erase
        //one relation either previous or next for just one element , but for
        //arraylists , we should every time deleted or inserted an element from the
        //begining or the end shift the indices of all other elements so
        //we should go for sure at least once in the whole array

        // 4️⃣ Random access test
        testRandomAccess(arrayList, "ArrayList");
        testRandomAccess(linkedList, "LinkedList");

        //here , it's the remontada for ArrayLists because of theirr continous
        //storing of adresses simple clever math will lead them to where they want to be
        //therefore just retreiving the value, for linkedliists they don't know
        //anything about adresses(they know orders of elements ) but not their
        //adresses, so they again should go through all of them untill finally
        //found the one.
    }

    // ------------------------------------------------------------

    private static void testRandomInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        list.add(random.nextInt() , 5774);
        list.remove(random.nextInt() );


        long end = System.nanoTime();
        System.out.printf("%s - Random insert/delete: %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testSequentialInsertDelete(List<Integer> list, String name) {
        long start = System.nanoTime();





        if (name == "LinkedList")
        {
            // Insertions at beginning and end
            list.addFirst(52144);
            list.addLast(52454);
            // Deletions at beginning and end
            list.removeFirst();
            list.removeLast();
        }
        else {
            list.add(0,5245);
            list.add(5245);
            list.remove(0);
            list.remove(list.size()-1);
        }

        long end = System.nanoTime();
        System.out.printf("%s - Sequential insert/delete (start/end): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testRandomAccess(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();
        int no = 0;
        long sum = 0;
        // sum of the all elements accessed randomly the list
       while(no < 100) {
           sum += list.get(random.nextInt());
        no+=1;
       }
        long end = System.nanoTime();
        System.out.printf("%s - Random access (get): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }
}

