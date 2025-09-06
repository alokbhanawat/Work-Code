package Codes;

import java.util.Scanner;

class Tour {
    	    private String TCode;
    	    private int NoofAdults;
    	    private int NoofKids;
    	    private int Kilometres;
    	    private float TotalFare;
    	    
    	    public Tour() {
    	    	this.TCode="NULL";
    	    	this.NoofAdults=0;
    	    	this.NoofKids=0;
    	    	this.Kilometres=0;
    	    	this.TotalFare=0;
    	    	
    	    }

			public String getTCode() {
				return TCode;
			}

			public void setTCode(String TCode) {
				this.TCode = TCode;
			}

			public int getNoofAdults() {
				return NoofAdults;
			}

			public void setNoofAdults(int NoofAdults) {
				this.NoofAdults = NoofAdults;
			}

			public int getNoofKids() {
				return NoofKids;
			}

			public void setNoofKids(int NoofKids) {
				this.NoofKids = NoofKids;
			}

			public int getKilometres() {
				return Kilometres;
			}

			public void setKilometres(int kilometres) {
				this.Kilometres = kilometres;
			}

			public float getTotalFare() {
				return TotalFare;
			}
    	    
    	   
			
			public void  assignFare() {
            	   int adultFare=0;
            	   
            	   if(Kilometres>1000) {
            		   adultFare=500;
            	   }else if(Kilometres<1000 && Kilometres>=500) {
            		   adultFare=300;
            	   }else {
            		   adultFare=500;
            	   }
            	  
            	  TotalFare=(NoofAdults*adultFare)+(NoofKids*(adultFare/2.0f));
            	  
         }
              
			public void EndTour() {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter Tour Code: ");
		        setTCode(sc.nextLine());

		        System.out.println("Enter No Of Adults: ");
		        setNoofAdults(sc.nextInt());

		        System.out.println("Enter No of Kids: ");
		        setNoofKids(sc.nextInt());

		        System.out.println("Enter kilometres: ");
		        setKilometres(sc.nextInt());

		        assignFare();
		    }

		    // Method to display using getters
		    public void showTour() {
		        System.out.println("______Displaying Tour Details______");
		        System.out.println("Tour Code-- " + getTCode());
		        System.out.println("Adults are " + getNoofAdults());
		        System.out.println("Kids are " + getNoofKids());
		        System.out.println("Kilometres " + getKilometres());
		        System.out.println("Total Fare " + getTotalFare());
		    }
		}

		public class Tourss {
		    public static void main(String[] args) {
		        Tour t1 = new Tour();
		        t1.EndTour();
		        t1.showTour();
		    }
		}

