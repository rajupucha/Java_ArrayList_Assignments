import java.util.ArrayList;

public class Assignment3_ProductPriceList {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();

        prices.add(100.50);
        prices.add(250.75);
        prices.add(300.00);
        prices.add(450.25);
        prices.add(500.50);
        prices.add(650.75);

        prices.add(1, 175.50);
        prices.set(prices.size() - 1, 700.00);
        prices.remove(2);

        System.out.println("Price at index 2: " + prices.get(2));
        System.out.println("Total Prices: " + prices.size());
        System.out.println("Final Price List: " + prices);
    }
}
