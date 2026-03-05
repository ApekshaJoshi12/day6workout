import java.util.TreeSet;
public class Main3 {
    public static void main(String[] args) {
        TreeSet<String> names= new TreeSet<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Kaira");
        System.out.println(names);
        System.out.println(names.contains("Bob"));
        names.remove("Bob");
        System.out.println(names);
        System.out.println(names.size());
        names.clear();
        System.out.println(names);
    }
}
