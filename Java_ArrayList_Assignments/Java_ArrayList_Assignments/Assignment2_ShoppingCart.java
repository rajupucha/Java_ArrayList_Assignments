import java.util.ArrayList;

public class Assignment2_ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();

        cart.add("Rice");
        cart.add("Milk");
        cart.add("Sugar");
        cart.add("Soap");
        cart.add("Bread");
        cart.add("Oil");
        cart.add("Tea");

        System.out.println("Is Milk present? " + cart.contains("Milk"));

        cart.add(2, "Butter");
        int sugarIndex = cart.indexOf("Sugar");
        cart.set(sugarIndex, "Brown Sugar");
        cart.remove("Soap");

        System.out.println("Updated Shopping Cart: " + cart);
        System.out.println("Total Items: " + cart.size());
    }
}
