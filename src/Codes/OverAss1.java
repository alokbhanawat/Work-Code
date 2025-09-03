package Codes;

class Bills {
    // Find price by itemId
    public double findPrice(int itemId) {
        switch (itemId) {
            case 1001:
                return 25;
            case 1002:
                return 20;
            case 1003:
                return 23;
            case 1004:
                return 18;
            default:
                return 0;
        }
    }

    // Find price by brandName, itemType, and size
    public double findPrice(String brandName, String itemType, int size) {
        if (brandName.equals("Puma")) {
            if (itemType.equals("T-shirt") && (size == 34 || size == 36)) {
                return 25;
            } else if (itemType.equals("Skirt") && (size == 38 || size == 40)) {
                return 20;
            }
        } else if (brandName.equals("Reebok")) {
            if (itemType.equals("T-shirt") && (size == 34 || size == 36)) {
                return 23;
            } else if (itemType.equals("Skirt") && (size == 38 || size == 40)) {
                return 18;
            }
        }
        return 0;
    }
}

class OverAss1{
    public static void main(String[] args) {
        Bills bill = new Bills();

        // Test with itemId
        double price = bill.findPrice(1001);
        if (price > 0)
            System.out.println("Price of the selected item is $" + price);
        else
            System.out.println("The Item Id is invalid");

        // Test with brandName, itemType, and size
        price = bill.findPrice("Reebok", "T-shirt", 34);
        if (price > 0)
            System.out.println("Price of the selected item is $" + price);
        else
            System.out.println("The values are not valid");
    }
}
