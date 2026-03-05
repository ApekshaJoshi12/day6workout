import java.util.ArrayList;

public class UpdateSalary {
    public static void main(String[] args) {

        
        ArrayList<Double> salaries = new ArrayList<>();

        salaries.add(25000.0);
        salaries.add(30000.0);
        salaries.add(28000.0);
        salaries.add(35000.0);

        
        salaries.set(2, 32000.0);

        
        System.out.println("Updated Salaries: " + salaries);
    }
}