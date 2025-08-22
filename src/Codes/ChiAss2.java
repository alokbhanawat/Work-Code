package Codes;

public class ChiAss2 {

	 public static void main(String[] args) {
	        int heads = 150;
	        int legs = 500;

	        int chickens = -1, rabbits = -1;
	        boolean valid = false;

	        
	        for (int r = 0; r <= heads; r++) {
	            int c = heads - r;  // chickens
	            if ((2 * c + 4 * r) == legs) {
	                chickens = c;
	                rabbits = r;
	                valid = true;
	                break;
	            }
	        }

	        if (valid) {
	            System.out.println("Number of Chickens: " + chickens);
	            System.out.println("Number of Rabbits: " + rabbits);
	        } else {
	            System.out.println("No valid solution possible with given heads and legs.");
	        }
	    }
	}