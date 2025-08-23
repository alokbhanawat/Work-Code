package Codes;

public class DiSumAss3 {

	public static void main(String[] args) {
		
		int number=2250;
		int temp=number;
		int sum=0;
		
		while(temp>0) {
			int digits = temp % 10;
			sum+=digits;
			temp /=10;
		}
			
			if(sum != 0 && number%sum==0) {
				 System.out.println(number + " is divisible by the sum of its digits");
			}else {
	            System.out.println(number + " is not divisible by the sum of its digits");
	        }
			
		

	}

}
