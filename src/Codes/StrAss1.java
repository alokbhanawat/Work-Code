package Codes;

public class StrAss1 {

	public static String moveSpecial(String str) {
		
		String normal="";
		String special="";
		
		for (int i=0 ; i<str.length();i++) {
			char ch =str.charAt(i);
		
		
		if (Character.isLetterOrDigit(ch)) {
			normal=normal+ch;		
		}else {
			special=special+ch;
			  }
		

	       }
             return normal+special;
}


         public static void main(String args[]){
         String str1 = "He@#$llo!*&";
         System.out.println(moveSpecial(str1));
         
         
         String str2 = "%$Wel*&come!";
         System.out.println(moveSpecial(str2));
         
         
         
         
}

}