import java.util.HashSet;
public class Main2 {
    public static void main(String[] args) {
        HashSet<String> names= new HashSet<String>();
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
