import java.util.LinkedHashSet;
public class Main4 {
    public static void main(String[] args) {
        LinkedHashSet<String> names= new LinkedHashSet<String>();
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
