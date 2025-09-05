package javaCases;

class Circle{
    private final double PI = 3.14;
    private double diameter;
    private double circumference;
    private double area;
 
    public Circle(double diameter) {
        this.diameter = diameter;
    }
 
    public void calculateCircumference() {
        this.circumference = PI * diameter;
    }
 
    public void calculateArea() {
        double radius = diameter / 2.0;
        // this.area = PI * radius * radius;
        setArea(PI*radius*radius);
    }
 
    public double getDiameter() {
        return diameter;
    }
 
    public double getCircumference() {
        return circumference;
    }
 
    public double getArea() {
        return area;
    }
 
    public double getPI() {
        return PI;
    }
 
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
 
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }
 
    public void setArea(double area) {
        this.area = area;
    }
}
 
class FinAss1{
    public static void main(String[] args) {
        Circle circle1 = new Circle(10.2);
        Circle circle2 = new Circle(5.7);
        Circle c3= new Circle(12.2);
 
        //Create more objects of Circle class and add to the array given below for testing your code    
        Circle[] circles = {circle1, circle2};
        for (Circle circle : circles) {
            circle.calculateCircumference();
            circle.calculateArea();
            System.out.println("Diameter of the circle is "+circle.getDiameter());
            System.out.println("Circumference of the circle is " + Math.round(circle.getCircumference()*100)/100.0);
            System.out.println("Area of the circle is " + Math.round(circle.getArea()*100)/100.0);
            System.out.println();
        }           
         System.out.println(c3.getArea());
    }
}
 