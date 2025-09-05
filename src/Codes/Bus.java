package Codes;

import java.util.Scanner;

public class Bus {
	
	private int busNo;
	private String from;
	private String to;
	private char type;
	private int distance;
	private double fare;
	
	public Bus() {
		this.type='O';
		this.fare=500;
	}
	
	
// Getters and Setters
	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	


	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	
	


	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}


	
	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}




	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}



	public double getFare() {
		return fare;
	}

	
	
	//Function 
	public void calcFare() {
		switch (type) {
		case 'O':fare =15*distance;
		break;
		case 'E':fare =20*distance;
		break;
		case 'L':fare =24*distance;
		break;
		default:fare=500;
		}
		
	}
	
	// Allocate
	
	public void allocate() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Bus No: ");
		setBusNo(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter From: ");
		setFrom(sc.nextLine());
		
		System.out.println("Enter To: ");
		setTo(sc.nextLine());
		
		System.out.println("Enter Bus Type : ");
		setType(sc.nextLine().charAt(0));
		
		System.out.println("Enter Distance: ");
		setDistance(sc.nextInt());
		
		
		calcFare();
		
		
	}
	
	// show 
	
	public void  show() {
		
		System.out.println("______Displaying Details______");
		System.out.println("Bus No-- "+ getBusNo());
		System.out.println("From-- " + getFrom());
		System.out.println("To-- " + getTo());
		System.out.println("Type-- " + getType());
		System.out.println("Distance-- " + getDistance());
		System.out.println("Total Fare--1 " + getFare());

	
	}
	


	public static void main(String[] args) {
		Bus b1 =new Bus();
		b1.allocate();
		b1.show();

	}

}


