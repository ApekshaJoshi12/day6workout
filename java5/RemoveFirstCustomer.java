import java.util.LinkedList;

public class RemoveFirstCustomer {
    public static void main(String[] args) {
        LinkedList<String> customers = new LinkedList<>();

        customers.add("Customer1");
        customers.add("Customer2");
        customers.add("Customer3");

        customers.removeFirst();  

        System.out.println("After removing first customer: " + customers);
    }
}