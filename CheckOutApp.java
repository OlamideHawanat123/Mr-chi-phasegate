import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CheckOutApp{
	public static void main(String... ericalli) {

        Scanner customerInput = new Scanner(System.in);

        System.out.println("What is the customer's Name? ");
        String customerName = customerInput.nextLine();

        System.out.print("Enter the cashier's name: ");
        String cashierName = customerInput.nextLine();

        double totalDiscount = 0;
        double totalCost = 0;
        boolean addMore;
        String receipt = "";

        LocalTime currentTime;
        DateTimeFormatter timeFormatter;
        do {
            System.out.print("What did the user buy?");
            String customerPurchase = customerInput.nextLine();


            System.out.print("How many pieces?");
            int quantity = customerInput.nextInt();
            while (quantity <= 0) {
                System.out.println("Invalid input,Please try again...");
                quantity = customerInput.nextInt();
            }


            System.out.print("How much per unit?");
            double price = customerInput.nextDouble();
            while (price <= 0) {
                System.out.println("Invalid price,Please input a valid price...");
                price = customerInput.nextDouble();
            }


            double itemCost = quantity * price;

            System.out.print("How much discount are you applying(in percentage): ");
            double discountPercentage = customerInput.nextDouble();

            double discountValue = (discountPercentage / 100) * itemCost;
            totalCost += itemCost - discountValue;
            totalDiscount += discountValue;

            receipt += String.format("%-20s %-5d %-10.2f %-10.2f\n", customerPurchase, quantity, price, itemCost);

            customerInput.nextLine();

            System.out.print("Add more items?");
            String response = customerInput.nextLine();
            addMore = response.equalsIgnoreCase("yes");

            currentTime = LocalTime.now();
            timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
            LocalDate currentDate = LocalDate.now();

        } while (addMore);
        double vat = 0;
        double total = totalCost + vat;


        System.out.println("==============================================");
        System.out.println("SEMICOLON STORES ");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: HERBERT MACAULY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Date :" + LocalDate.now() + "   " + currentTime.format(timeFormatter));
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer's Name: " + customerName);
        System.out.println("_______________________________________________");

        System.out.printf("%-15s %-5s %-10s %-10s\n", "ITEM", "QTY", "PRICE", "TOTAL (NGN)");

        System.out.print(receipt);

        System.out.println("==============================================");

        System.out.printf("%-25s %-10.2f\n", "Total Cost:", totalCost);
        System.out.printf("%-25s %-10.2f\n", "Discount:", totalDiscount);
        System.out.printf("%-25s %-10.2f\n", "VAT @ 17.50%:", vat);
        System.out.printf("%-25s %-10.2f\n", "Total:", total);
        System.out.println("KINDLY MAKE PAYMENT");
        System.out.println("_______________________________________________");

        double amountPaid;
        do {
            System.out.print("\n\nInput the amount paid: ");
            amountPaid = customerInput.nextDouble();
            if (amountPaid < total) {
                System.out.println("Insufficient payment. Kindly pay the full amount.");
            }

        } while (amountPaid < total);
        System.out.println("Payment received. Thank you!");
        vat = totalCost * 0175;
        double balance = amountPaid - total;


        System.out.println("\n==============================================");
        System.out.println("SEMICOLON STORES ");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: HERBERT MACAULY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Date : " + LocalDate.now() + "   " + currentTime.format(timeFormatter));
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer's Name: " + customerName);
        System.out.println("_______________________________________________");

        System.out.printf("%-15s %-5s %-10s %-10s\n", "ITEM", "QTY", "PRICE", "TOTAL 	(NGN)");

        System.out.print(receipt);

        System.out.println("==============================================");

        System.out.printf("%-25s %-10.2f\n", "Total Cost:", totalCost);
        System.out.printf("%-25s %-10.2f\n", "Discount:", totalDiscount);
        System.out.printf("%-25s %-10.2f\n", "VAT @ 17.50%:", vat);
        System.out.printf("%-25s %-10.2f\n", "Total:", total);
        System.out.println("KINDLY MAKE PAYMENT");
        System.out.println("_______________________________________________");


        System.out.println("===============================================");
        System.out.printf("%-25s %-10.2f\n", "Amount Paid:", amountPaid);
        System.out.printf("%-25s %-10.2f\n", "Balance:", balance);

        System.out.println("_______________________________________________");
        System.out.println("THANK YOU FOR YOUR PATRONAGE ");
        System.out.println("===============================================");


    }
}