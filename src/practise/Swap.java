package practise;

public class Swap {

	public static void main(String[] args) {
		
		float first =1.5f;
		float Second= 2.5f;
		
		System.out.println("Before Swap");
		System.out.println("First Number "+first);
		System.out.println("Second Number "+Second);
		
		
		
		float Temp = first;
		first=Second;
		Second=Temp;
		
		System.out.println("After Swap");
		
		System.out.println("First Number "+first);
		System.out.println("Second Number "+Second);
		
		
		

		

	}

}
