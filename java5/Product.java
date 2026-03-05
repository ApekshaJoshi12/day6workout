import java.util.ArrayList;

class Product {
    public static void main(String[] args) {
        ArrayList<String> product1 = new ArrayList<>();
        product1.add("Laptop");
        product1.add("Mouse");
        product1.add("Keyboard");
        product1.add("Monitor");
        product1.add("Headphone");
        for(String products:product1){
            System.out.println(products);
        }

    }
}