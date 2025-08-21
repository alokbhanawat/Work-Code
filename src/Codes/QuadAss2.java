package Codes;

public class QuadAss2 {

	public static void main(String[] args) {
		
		int a=1;
		int b=4;
		int c=4;
		
		
		int d =(b*b)-(4*a*c);
		
		if (d == 0) {
		double root=-b/(2.0*a);
		System.out.println("The Root is" +root);
			
		}else if(d >0) {
		 double root1 = (-b+ Math.sqrt(d))/(2.0*a);
		 double root2 = (-b+ Math.sqrt(d))/(2.0*a);
		 
		  System.out.println("The Roots Are"+ root1 +"and"+ root2);
		}
		else {
			System.out.println("No Real Root");
		}
	}

}
