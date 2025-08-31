package Codes;

public class ArrAss2 {
	
	public static double[] findDetails(double[] salary){
		
		double[] result = new double[3];
		
		double sum=0;
		
		for(double s:salary) {
			sum+=s;
		}
		
		double avg = sum/salary.length;
		result[0]=avg;
		
		int lessCount =0;
		int greatCount=0;
		
		for (double s : salary) {
			if (s> avg) {
				greatCount++;
			}else if(s<avg) {
				lessCount++;
			}
			
		}
		
		result[1]=greatCount;
		result[2]=lessCount;
		
		return result;
		
		
	}
	
	

	public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: " + details[0]);
        System.out.println("Number of salaries greater than the average salary: " + details[1]);
        System.out.println("Number of salaries lesser than the average salary: " + details[2]);
    }
}