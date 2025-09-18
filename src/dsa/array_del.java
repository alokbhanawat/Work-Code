package dsa;

import java.util.Scanner;

public class array_del {
	public static void main(String args[]) {
		 int n;
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter No Of Elements in Array");
		 n=s.nextInt();
		 int a[]=new int[n];
		 int b[]=new int[n-1];

		 System.out.println("Enter Values");
		 for (int i=0;i<n;i++) {
			 a[i]=s.nextInt();
		 }
		 
		 System.out.println("Enter Index of values to be deleted ");
         int m=s.nextInt();	
         for (int i=0; i<a.length;i++) {
        	 if(i<m) {
        		 b[i]=a[i];
        	 }
        	 else if (i==m)
        		 
        		 continue;
        	 else {
        		 b[i-1]=a[i];
        	 }
        		 
         }
        
		 
		 
		 System.out.println("Elements are : ");
		 for (int i=0;i<n-1;i++) {
			System.out.println(b[i]);
		 }

		 
	}

}
// Array Del
