public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;

    public GroceryItemOrder(String name, double pricePerUnit) {
        this.name = name;
        this.quantity = 1; 
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost() {
        return quantity * pricePerUnit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
