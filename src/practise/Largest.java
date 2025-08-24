package practise;

public class Largest {

	public static void main(String[] args) {
		
		double n1 = 45, n2 = 3.9, n3 = 2.5;
		
		
		if(n1>=n2 && n1>=n3) {
			System.out.println(n1+" is Largest");
		}else if(n2>=n1 && n2>=n3) {
			System.out.println(n2+" is Largest");

		}else {
			System.out.println(n3+" is Largest");

		}

	}

}
