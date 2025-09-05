package javaCases;

interface Tax{

    double calculateTax(double price);

}
 
class PurchaseDetails implements Tax {

    private String purchaseId;

    private String paymentType;

    private double taxPercentage;
 
    public PurchaseDetails(String purchaseId, String paymentType) {

        this.purchaseId = purchaseId;

        this.paymentType = paymentType;
 
        if (paymentType.equalsIgnoreCase("Debit Card")) {

            this.taxPercentage = 2.0;

        } else if (paymentType.equalsIgnoreCase("Credit Card")) {

            this.taxPercentage = 3.0;

        } else {

            this.taxPercentage = 4.0;

        }

    }
 
    public String getPurchaseId() {

        return purchaseId;

    }
 
    public void setPurchaseId(String purchaseId) {

        this.purchaseId = purchaseId;

    }
 
    public String getPaymentType() {

        return paymentType;

    }
 
    public void setPaymentType(String paymentType) {

        this.paymentType = paymentType;

    }
 
    public double getTaxPercentage() {

        return taxPercentage;

    }
 
    public void setTaxPercentage(double taxPercentage) {

        this.taxPercentage = taxPercentage;

    }
 
    @Override

    public double calculateTax(double price) {

        double tax = price * taxPercentage / 100;

        return price + tax;

    }

}
 
class Seller implements Tax {

    private String location;

    private double taxPercentage;
 
    public Seller(String location) {

        this.location = location;

    }
 
    public String getLocation() {

        return location;

    }
 
    public void setLocation(String location) {

        this.location = location;

    }
 
    public double getTaxPercentage() {

        return taxPercentage;

    }
 
    public void setTaxPercentage(double taxPercentage) {

        this.taxPercentage = taxPercentage;

    }
 
    @Override

    public double calculateTax(double price) {

        switch (location) {

            case "Middle east":

                taxPercentage = 15.0;

                break;

            case "Europe":

                taxPercentage = 25.0;

                break;

            case "Canada":

                taxPercentage = 22.0;

                break;

            case "Japan":

                taxPercentage = 12.0;

                break;

            default:

                taxPercentage = 0.0; 

        }

        return price * (taxPercentage / 100.0);

    }

}
 
class IntAss1{

    public static void main(String args[]) {

		System.out.println("Purchase Details\n***************");

		PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");

		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);

		System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());
 
        System.out.println("Seller Details\n***************");

		Seller seller = new Seller("Canada");

		System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(335)*100)/100.0);

		System.out.println("Tax percentage: "+seller.getTaxPercentage());

		//Create more objects for testing your code

	}

}
 
