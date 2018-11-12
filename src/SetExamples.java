import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args)
    {
        List<String> colours = Arrays.asList("black","blue","orange",
                                             "purple", "blue","red","red",
                                             "magenta","red","purple",
                                             "green","pink","sarcasm");

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(colours);

        //This shows that the HashSet removes duplicates and
        //does not preserve order
        System.out.println("List:    "+colours);
        System.out.println("HashSet: "+hashSet);

        //TreeSet removes duplicates and will order the elements
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(colours);
        System.out.println("TreeSet: "+treeSet);




    }
}
