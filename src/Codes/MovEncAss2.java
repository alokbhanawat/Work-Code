package Codes;
class MovieTicket{
	
	private int movieId;
	private int noOfSeats;
	private double costPerTicket;
	
	 public MovieTicket(int movieId, int noOfSeats) {
	        this.movieId = movieId;
	        this.noOfSeats = noOfSeats;
	    }
	 
	 // Getter for movieId
	    public int getMovieId() {
	        return movieId;
	    }

	    // Setter for movieId
	    public void setMovieId(int movieId) {
	        this.movieId = movieId;
	    }
	    
	    public int getNoOfSeats() {
	        return noOfSeats;
	    }

	    // Setter for noOfSeats
	    public void setNoOfSeats(int noOfSeats) {
	        this.noOfSeats = noOfSeats;
	    }
	    
	    public double getCostPerTicket() {
	        return costPerTicket;
	    }
	    public void setCostPerTicket(double costPerTicket) {
	        this.costPerTicket = costPerTicket;
	    }
	    
	    
	    public double calculateTotalAmount() {
	    	switch (this.movieId) {
	    	case 111:
	    		this.costPerTicket=7;
	    		break;
	    	case 112:
	            this.costPerTicket = 8;
	            break;
	        case 113:
	            this.costPerTicket = 8.5;
	            break;
	        default:
                return 0;
                      
	    	}
	    	  if (this.noOfSeats <= 0) {
	              return 0;
	          }
	    	  
	          double totalCost = this.noOfSeats * this.costPerTicket;

	          
	          double totalAmountWithTax = totalCost * 1.02;
	          
	          return Math.round(totalAmountWithTax);

	    
}
}

	
	


public class MovEncAss2 {

	  public static void main(String[] args) {
	        MovieTicket movieTicket = new MovieTicket(112, 3);
	        double amount = movieTicket.calculateTotalAmount();
	        if (amount==0)
	            System.out.println("Sorry ! Please enter valid movie Id and number of seats");
	        else
	            System.out.println("Total amount for booking : $" + amount);
	    
	}
}
