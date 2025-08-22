package Codes;

public class PalAss1 {

	public static void main(String[] args) {
		int number =1331;
		int originalNumber= number;
		int reversed =0;
		while(number>0) {
			int digit = number%10;
			reversed = reversed*10+digit;
			number =number/10;
			
		}
			
			if(originalNumber==reversed) {
				System.out.println(originalNumber +" It is Palindrome Number");
			}else {
				System.out.println(originalNumber +" It is Not a Panindrome Number");

			}	
		

	}

}
