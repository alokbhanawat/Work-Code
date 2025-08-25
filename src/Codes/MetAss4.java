package Codes;


 class Order{
	    public int orderId;
	    public String orderedFoods;
	    public String status;
	    
	    public Order() {
	        this.status = "Ordered";
	    }
	    
	    public Order(int orderId, String orderedFoods) {
	        this.orderId = orderId;
	        this.orderedFoods = orderedFoods;
	        this.status = "Ordered"; // status always set to Ordered
	    }
}

     

public class MetAss4 {

	public static void main(String[] args) {
		
		 Order order1 = new Order();
	     System.out.println("Order Status: " + order1.status);
	     
	        Order order2 = new Order(101, "Pizza, Burger");
	        
	        System.out.println("Order ID: " + order2.orderId);
	        System.out.println("Ordered Foods: " + order2.orderedFoods);
	        System.out.println("Order Status: " + order2.status);


		
		

	}

}
