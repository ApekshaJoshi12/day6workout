import java.util.LinkedList;

public class HospitalQueue {
    public static void main(String[] args) {
        LinkedList<String> patients = new LinkedList<>();

        patients.add("Patient1");
        patients.add("Patient2");

        patients.addFirst("Emergency Patient");  

        System.out.println("Hospital Waiting List: " + patients);
    }
}