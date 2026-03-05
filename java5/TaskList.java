import java.util.LinkedList;

public class TaskList {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Design");
        tasks.add("Develop");
        tasks.add("Test");

        System.out.println("First Task: " + tasks.getFirst());
        System.out.println("Last Task: " + tasks.getLast());
    }
}