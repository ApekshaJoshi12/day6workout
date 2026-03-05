import java.util.TreeSet;

public class SortRollNumbers {
    public static void main(String[] args) {

        TreeSet<Integer> rolls = new TreeSet<>();

        rolls.add(105);
        rolls.add(101);
        rolls.add(103);
        rolls.add(102);

        System.out.println("Sorted Roll Numbers:");
        for (int roll : rolls) {
            System.out.print(roll + " ");
        }
    }
}