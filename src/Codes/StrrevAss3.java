package Codes;

class StrrevAss3 {
    public static String reverseEachWord(String str){
        
        String[] words= str.split(" ");
        StringBuilder result = new StringBuilder();
        
        
        
        for (String word: words){
            StringBuilder reversed =new StringBuilder (word);
            result.append(reversed.reverse().toString()).append(" ");
        }
        
        
        
        return result.toString().trim();
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
}