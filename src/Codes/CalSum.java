package Codes;

class CalSum {
    
    public static int calculateSumOfEvenNumbers(int[] numbers) {
        int sum = 0;  
        for(int num : numbers) {
            if(num % 2 == 0) { 
                sum += num;   
            }
        }
        return sum; // return final sum
    }
    
    public static void main(String[] args) {
        int[] numbers = {68,79,86,99,23,2,41,100};
        System.out.println("Sum of even numbers: " + calculateSumOfEvenNumbers(numbers));

        // Example with sample input 1 2 3 4 5 6 7 8 9 10
        int[] numbers2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Sum of even numbers: " + calculateSumOfEvenNumbers(numbers2));
    }
}