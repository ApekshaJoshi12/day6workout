import java.util.ArrayList;

public class SearchStudent {
    public static void main(String[] args) {

        
        ArrayList<String> students = new ArrayList<>();

        
        students.add("Rahul");
        students.add("Amit");
        students.add("Sneha");
        students.add("Priya");

        
        if (students.contains("Rahul")) {
            System.out.println("Rahul exists in the list.");
        } else {
            System.out.println("Rahul not found.");
        }
    }
}