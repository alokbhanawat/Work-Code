package practise;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ha2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
       
       int lineNumber =1;
       
       while (sc.hasNextLine()) {
    	    String line = sc.nextLine();
    	    if (line.trim().isEmpty()) {
    	        continue;  // skip empty lines
    	    }
    	    System.out.println(lineNumber + " " + line);
    	    lineNumber++;
    	}
       
   
    }
}