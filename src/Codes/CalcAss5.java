package Codes;


class Calculator{
	public double findAverage(int num1, int num2, int num3) {
		double average =(num1+num2+num3)/3.0;
		return Math.round(average*100.0)/100.0;		
	}
}

public class CalcAss5 {

	public static void main(String[] args) {
		
		Calculator calculator =new Calculator();
		
		double avg = calculator.findAverage(12,8,15);

		
		System.out.println("Average " + avg);
	}

}
