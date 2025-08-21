package Codes;

public class ProAss3 {

	public static void main(String[] args) {
		
		int a=1,b=5,c=3;
		int result;
		
		if(a==7) {
			if(b==7 && c==7) {
		      result=-1;
			}else if(b==7 && c!=7) {
				result=c;
			}else if (c==7) {
				result=-1;
			}else {
				result=b*c;
			}
		
		} else if(b==7) {
			if(c==7) {
				result=-1;
			}else {
				result=c;
			}
		} else if (c==7) {
			result=-1;
		}else {
			result=a*b*c;
		}
		
		
	System.out.println(result);

	}

}
