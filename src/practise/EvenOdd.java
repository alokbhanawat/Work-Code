package practise;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		try (Scanner scanner =new Scanner(System.in)){;
		
		System.out.println("Enter a Number");
		
		int num = scanner.nextInt();
		
	    if(num%2==0) {
	    	System.out.println(+num+ " is Even");
	    }else {
	    	System.out.println(+num+ " is Odd");
	    }
		}

	}

}
