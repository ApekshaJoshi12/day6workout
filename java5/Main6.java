import java.util.ArrayList;

class Main6 {
    public static void main(String[] args) {
        ArrayList<String> order = new ArrayList<>();
          order.add("order100");
          order.add("order101");
          order.add("order103");
          System.out.println(order);
          order.remove(1);
          System.out.println(order);
    }
}