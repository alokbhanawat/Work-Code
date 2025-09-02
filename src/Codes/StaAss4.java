package Codes;
class Booking {
    private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;
    private static int seatsAvailable;

    // Static block to initialize seats
    static {
        seatsAvailable = 400;
    }

    // Constructor
    public Booking(String customerEmail, int seatsRequired) {
        this.customerEmail = customerEmail;
        this.seatsRequired = seatsRequired;

        if (seatsRequired <= seatsAvailable) {
            isBooked = true;
            seatsAvailable -= seatsRequired;
        } else {
            isBooked = false;
        }
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getSeatsRequired() {
        return seatsRequired;
    }

    public void setSeatsRequired(int seatsRequired) {
        this.seatsRequired = seatsRequired;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public static int getSeatsAvailable() {
        return seatsAvailable;
    }

    public static void setSeatsAvailable(int seatsAvailable) {
        Booking.seatsAvailable = seatsAvailable;
    }
}

public class StaAss4 {

	public static void main(String[] args) {
        Booking booking1 = new Booking("jack@email.com", 100);
        Booking booking2 = new Booking("jill@email.com", 350);

        // Add more bookings for testing
        Booking booking3 = new Booking("alex@email.com", 50);
        Booking booking4 = new Booking("mike@email.com", 200);

        Booking[] bookings = { booking1, booking2, booking3, booking4 };

        for (Booking booking : bookings) {
            if (booking.isBooked()) {
                System.out.println(booking.getSeatsRequired() + 
                                   " seats successfully booked for " + 
                                   booking.getCustomerEmail());
            } else {
                System.out.println("Sorry " + booking.getCustomerEmail() + 
                                   ", required number of seats are not available!");
                System.out.println("Seats available: " + Booking.getSeatsAvailable());
            }
        }
    }
}