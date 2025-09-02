package Codes;



class Order12 {
    private static int orderIdCounter;
    private int orderId;
    private Food12[] orderedFoods;
    private double totalPrice;
    private String status;

    static {
        orderIdCounter = 101;
    }

    public Order12() {}

    public Order12(Food12[] orderedFoods) {
        this.orderedFoods = orderedFoods;
        this.orderId = orderIdCounter++;
    }

    public static int getTotalNoOfOrders() {
        return orderIdCounter - 101;
    }

    public int getOrderId() {
        return orderId;
    }

    public Food12[] getOrderedFoods() {
        return orderedFoods;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public double calculateTotalPrice(String paymentMode) {
        double priceWithoutCharge = 0;
        if (orderedFoods != null) {
            for (Food12 f : orderedFoods) {
                priceWithoutCharge += f.getUnitPrice() * f.getQuantity();
            }
        }

        double serviceCharge = priceWithoutCharge * 0.05;
        totalPrice = priceWithoutCharge + serviceCharge;
        this.status = "Paid by " + paymentMode;

        return totalPrice;
    }
}

  

 class Food12 {
    private String foodName;
    private int unitPrice;
    private int quantity;

    public Food12(String foodName, int unitPrice, int quantity) {
        this.foodName = foodName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}




public class StatAss2 {
    public static void main(String[] args) {
        Food12[] order1Foods = {
            new Food12("Pizza", 250, 2),
            new Food12("Burger", 120, 1),
            new Food12("Pasta", 150, 3)
        };

        Order12 order1 = new Order12(order1Foods);

        double total = order1.calculateTotalPrice("Card");

        System.out.println("Order ID: " + order1.getOrderId());
        System.out.println("Total Orders So Far: " + Order12.getTotalNoOfOrders());
        System.out.println("Total Price (with 5% service charge): " + total);
        System.out.println("Order Status: " + order1.getStatus());

        System.out.println("\nOrdered Items:");
        for (Food12 f : order1.getOrderedFoods()) {
            System.out.println(f.getFoodName() + " - " + f.getQuantity() +
                               " × " + f.getUnitPrice());
        }
    }
}
