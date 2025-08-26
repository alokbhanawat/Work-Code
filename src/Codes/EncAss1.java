package Codes;


   class Food {
    private int foodId;
    private String foodName;
    private double price;

    public Food(int foodId, String foodName, double price) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
    }

    public int getFoodId() 
    { 
    	return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    // Getter and Setter for foodName
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


    class Order1 {
    private int orderId;
    private String orderedFoods;
    private String status;

    // Constructor
    public Order1(int orderId, String orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
        this.status = "Ordered";
    }

    // Getter and Setter for orderId
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    // Getter and Setter for orderedFoods
    public String getOrderedFoods() {
        return orderedFoods;
    }

    public void setOrderedFoods(String orderedFoods) {
        this.orderedFoods = orderedFoods;
    }

    // Getter and Setter for status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

    class Tester {
    public static void main(String[] args) {
        // Create food object
        Food food = new Food(101, "Pizza", 250.0);

        // Using getters
        System.out.println("Food: " + food.getFoodName() + " - Price: " + food.getPrice());

        // Create order object
        Order1 order = new Order1(201, "Pizza");

        // Using getters
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Ordered Food: " + order.getOrderedFoods());
        System.out.println("Order Status: " + order.getStatus());

//         Using setters
        order.setStatus("Delivered");
        System.out.println("Updated Order Status: " + order.getStatus());
    }
}