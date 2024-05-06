package SolidPrinciples;

public class PlacementAction implements OrderPlacement {
    @Override
    public void placeOrder(String customerName, String address) {
        // Simulate placing order in a system
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
