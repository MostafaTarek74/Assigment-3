import java.util.ArrayList;

class GroceryList {
    private static final int MAX_ITEMS = 10;
    private final ArrayList<GroceryItemOrder> items;
    private int size;

    public GroceryList() {
        this.items = new ArrayList<>();
        this.size = 0;
    }

    public void add(GroceryItemOrder item) {
        if (size < MAX_ITEMS) {
            items.add(item);
            size++;
        } else {
            System.out.println("Sorry, the grocery list is full and cannot add any more items.");
        }
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (GroceryItemOrder item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }
}

public class Main {
    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList();


        GroceryItemOrder cookies = new GroceryItemOrder("Cookies", 2.30);
        cookies.setQuantity(4);
        groceryList.add(cookies);

        GroceryItemOrder milk = new GroceryItemOrder("Milk", 1.99);
        milk.setQuantity(2);
        groceryList.add(milk);


        double totalCost = groceryList.getTotalCost();
        System.out.println("Total cost: $" + totalCost);
    }
}
