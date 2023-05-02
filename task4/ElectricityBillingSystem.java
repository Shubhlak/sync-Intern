import java.util.Scanner;

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Electricity Billing System!");
        
        // Input customer information
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer ID: ");
        int customerID = scanner.nextInt();
        System.out.print("Enter previous meter reading: ");
        int previousMeterReading = scanner.nextInt();
        System.out.print("Enter current meter reading: ");
        int currentMeterReading = scanner.nextInt();
        
        // Calculate usage and bill
        int usage = currentMeterReading - previousMeterReading;
        double ratePerUnit = 7.5; // This can be adjusted depending on your billing system
        double billAmount = usage * ratePerUnit;
        
        // Output the bill
        System.out.println("\n\n");
        System.out.println("=========================================");
        System.out.println("          ELECTRICITY BILL");
        System.out.println("=========================================");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Previous Meter Reading: " + previousMeterReading);
        System.out.println("Current Meter Reading: " + currentMeterReading);
        System.out.println("Units Consumed: " + usage);
        System.out.println("Rate per Unit: " + ratePerUnit);
        System.out.println("=========================================");
        System.out.println("TOTAL BILL AMOUNT: " + billAmount);
        System.out.println("=========================================");
    }
}
