import java.util.HashSet;

public class RemoveDuplicateIDs {
    public static void main(String[] args) {

        int[] ids = {101, 102, 103, 101, 104, 102};

        HashSet<Integer> set = new HashSet<>();

        for (int id : ids) {
            set.add(id);   
        }

        System.out.println("Unique Student IDs:");
        for (int id : set) {
            System.out.print(id + " ");
        }
    }
}