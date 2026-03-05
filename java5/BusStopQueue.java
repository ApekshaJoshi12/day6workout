import java.util.LinkedList;

public class BusStopQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

       
        queue.addFirst("Rahul");   
        queue.addLast("Anita");    
        queue.addLast("Kiran");

        System.out.println("Bus Stop Queue: " + queue);
    }
}