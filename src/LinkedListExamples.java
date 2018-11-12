import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args)
    {
        ArrayList<String>  arrayList  = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        arrayList.add("Fred");
        arrayList.add("Constance");
        arrayList.add("Albert");
        arrayList.add("Bianca");
        System.out.println("ArrayList: "+arrayList);

        linkedList.add("Fred");
        linkedList.add("Constance");
        linkedList.add("Albert");
        linkedList.add("Bianca");
        System.out.println("LinkedList: "+linkedList);

    }
}
