import java.util.LinkedList;
class Main1 {
     public static void main(String[] args) {
        LinkedList<String>  names = new LinkedList<String>();
        names.addFirst("Sana");
        names.addFirst("Sani");
        names.addLast("Alice");
        names.addFirst("Bob");
        System.out.println(names);
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        names.removeFirst();
        System.out.println(names);
        names.removeLast();
        System.out.println(names);
     }    
}
