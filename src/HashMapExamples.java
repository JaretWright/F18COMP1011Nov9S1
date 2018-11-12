import java.util.HashMap;
import java.util.TreeMap;

public class HashMapExamples {
    public static void main(String[] args)
    {

        //HashMap objects accept key & value information
        //The key is provided first, then the value.  They do not
        //need to be the same type of object
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Fred","705-555-1234");
        contacts.put("Alfred", "416-662-7263");
        contacts.put("Elaine","905-333-1287");

        System.out.println("HashMap: "+contacts);

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Fred","705-555-1234");
        treeMap.put("Alfred", "416-662-7263");
        treeMap.put("Elaine","905-333-1287");

        System.out.println("TreeMap: "+treeMap);
    }
}
