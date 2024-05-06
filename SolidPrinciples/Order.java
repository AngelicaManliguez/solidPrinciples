package SolidPrinciples;

public class Order {
    private final OrderCalculator orderCalculator;
    private final OrderPlacement orderPlacement;
    private final OrderInvoice orderInvoice;

    public Order(OrderCalculator orderCalculator, OrderPlacement orderPlacement, OrderInvoice orderInvoice) {
        this.orderCalculator = orderCalculator;
        this.orderPlacement = orderPlacement;
        this.orderInvoice = orderInvoice;
    }

    public void orderWithoutInvoice(String customerName, String address, double price, int quantity) {
        orderCalculator.calculateTotal(price,quantity);
        orderPlacement.placeOrder(customerName, address);
    }

    public void orderWithInvoice(String fileName, String email)
    {
        orderInvoice.generateInvoice(fileName);
        orderInvoice.sendEmailNotification(email);
    }
}
