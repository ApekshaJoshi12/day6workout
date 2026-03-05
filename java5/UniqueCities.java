import java.util.HashSet;

public class UniqueCities {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Delhi");     
        cities.add("Hyderabad");

        System.out.println("Visited Cities:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}