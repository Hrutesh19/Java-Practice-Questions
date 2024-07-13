package OOP;

/***
 * Electricity bill questions condition
 * 1. Bill according to unit if unit is less than 50 calculate
 * 4 rupees per unit if unit 50-100 calculate 4 rupees
 * for 1-50 unit and 6 rupees for 51 to 10 unit and on
 */





public class Electricitybill {

    public static double calculateBill(int units) {
        double billAmount = 0;

        // Calculate bill based on the given conditions
        if (units <= 50) {
            billAmount = units * 4; // Rs. 4 per unit for 1-50 units
        } else if (units <= 100) {
            billAmount = 50 * 4 + (units - 50) * 6; // Rs. 4 per unit for 1-50 units, Rs. 6 per unit for 51-100 units
        } else {
            billAmount = 50 * 4 + 50 * 6 + (units - 100) * 8; // Rs. 4 per unit for 1-50 units, Rs. 6 per unit for 51-100 units, Rs. 8 per unit for units above 100
        }

        return billAmount;
    }

    public static void main(String[] args) {
        // Test the calculateBill method with different units consumed
        int units1 = 40;
        int units2 = 70;
        int units3 = 120;

        // Calculate and print bill amount for each case
        System.out.println("Bill for " + units1 + " units: Rs. " + calculateBill(units1));
        System.out.println("Bill for " + units2 + " units: Rs. " + calculateBill(units2));
        System.out.println("Bill for " + units3 + " units: Rs. " + calculateBill(units3));
    }
}
