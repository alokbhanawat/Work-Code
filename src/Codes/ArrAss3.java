package Codes;

public class ArrAss3 {
	
	public static int[] findLeapYears(int year) {
		int[] leapYears= new int[15];
		int count =0;
		
		while(count<15) {
			if (isLeapYear(year)) {
				leapYears[count]=year;
				count++;
			}
			year++;
		}
		
		return leapYears;
		
		
	}
	
	  private static boolean isLeapYear(int year) {
	        if (year % 400 == 0) {
	            return true;
	        } else if (year % 100 == 0) {
	            return false;
	        } else if (year % 4 == 0) {
	            return true;
	        }
	        return false;
	    }
	
	
	
	

	 public static void main(String[] args) {
	       int year = 2000;
		   int[] leapYears;
		   leapYears=findLeapYears(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }
	    }
	}
