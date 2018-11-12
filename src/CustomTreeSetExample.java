import java.util.TreeSet;

public class CustomTreeSetExample {
    public static void main(String[] args)
    {
        Bug bug1 = new Bug("NullPointerException",1);
        Bug bug2 = new Bug("No Suitable Driver Found",1);
        Bug bug3 = new Bug("Java hates me",5);
        Bug bug4 = new Bug("IOException",3);

        TreeSet<Bug> bugReport = new TreeSet<>();
        bugReport.add(bug1);
        bugReport.add(bug2);
        bugReport.add(bug3);
        bugReport.add(bug4);
        bugReport.add(bug4);

        for (Bug bug:bugReport)
            System.out.println(bug);
    }
}
