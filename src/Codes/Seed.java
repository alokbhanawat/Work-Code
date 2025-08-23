package Codes;

class Seed{
    public static void main(String[] args) {
        int X = 123; 
        int Y = 738; 
        isSeed(X, Y);    // Method Print
    }

    public static void isSeed(int X, int Y) {
        int product = X;
        
        int temp = X;
        

        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
            
        }

        if (product == Y) {
        	
        	
            System.out.println(X + " is a seed of " + Y);
        } else {
        	
            System.out.println(X + " is not a seed of " + Y);
        }
    }
}



