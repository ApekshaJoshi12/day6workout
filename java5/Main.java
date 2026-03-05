import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add(2,"Sana");
        System.out.println(names);
        System.out.println(names.get(0));
        names.set(3,"David");
        names.remove(3);
        System.out.println(names);
        System.out.println(names.size());
        names.clear();
        System.out.println(names);

    }    
}
