package Codes;

public class FoodAss4 {

	public static void main(String[] args) {
             char FoodType='N';
             int  quantity=2;
             int  distance=3;
             
             int billAmount=0;
             
             if((FoodType!='V' && FoodType!='N') || quantity<1 || distance<=0) {
            	 billAmount=-1;
             }else {
            	 int costPerPlate;
            	 if(FoodType=='V') {
            		 costPerPlate=12;
            		 
            	 }else {
            		    costPerPlate = 15;
            	 }
            	 
            	 int foodCost = costPerPlate * quantity;
            	 int deliveryCharge = 0;
            	 
            	 
             
             
             if (distance>3) {
            	 if(distance<=6) {
            		 deliveryCharge=(distance - 3) * 1;
            	 }else { 
            		 deliveryCharge = (3 * 1) + (distance - 6) * 2; 
            		 }
             }
            	 
            	 billAmount = foodCost + deliveryCharge;
             }
             System.out.println(billAmount);
	}

}
