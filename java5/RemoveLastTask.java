import java.util.LinkedList;

public class RemoveLastTask {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Design");
        tasks.add("Develop");
        tasks.add("Test");

        tasks.removeLast();  

        System.out.println("After removing last task: " + tasks);
    }
}