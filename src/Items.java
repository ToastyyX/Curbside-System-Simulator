import java.util.*;

public class Items {

    private ArrayList<String> items = new ArrayList<>();
    private ArrayList<Double> price = new ArrayList<>();

    public Items() {
        super();
    }

    public void addItems() {
        items.add("6 in. and 10 in. Adjustable Cushion Grip Wrench Set (2-Piece)");
        items.add("52 in. W x 21.5 in. D Heavy Duty 15-Drawer Combination Rolling Tool Chest Top Tool Cabinet " +
                "with LED Light in Matte Black");
        items.add("SHOCKWAVE IMPACT DUTY Titanium Drill Bit Set (23-Piece)");
    }

    public void addPrices() {
        price.add(12.99);
        price.add(999.99);
        price.add(24.99);
    }

    public void displayDetails(int index) {
        addItems();
        addPrices();
        System.out.println("Item: " + items.get(index).formatted());
        System.out.println("Price: " + "$" + price.get(index));
    }
}
