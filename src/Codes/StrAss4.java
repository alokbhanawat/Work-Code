package Codes;


class StrAss4{
public static int findHighestOccurrence(String str) {
	    int[] freq = new int[256];
	    
	    for (int i=0;i<str.length(); i++) {
	    	char ch= str.charAt(i);
	    	freq[ch]++;
	    }
	
	
          int maxCount=0;
          for (int i=0; i<256;i++) {
        	  if (freq[i]>maxCount) {
        		  maxCount =freq[i];
        	  }
          }
          return maxCount;
}
	
	

	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}