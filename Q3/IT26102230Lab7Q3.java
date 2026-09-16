import java.util.Scanner;

public class IT26102230Lab7Q3 {

    public static void main(String[] args) {

        final int NUMBER_OF_CUSTOMERS = 5;
        final double DISCOUNT_RATE = 0.05;

        Scanner lookfor = new Scanner(System.in);

        double bill;
        double discount;
        double amountToPay;
        String paymentMode;

        for (int customer = 1; customer <= NUMBER_OF_CUSTOMERS; customer++) {

            System.out.print("Enter total bill amount of customer " + customer + ": ");
            bill = lookfor.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = lookfor.next();

            paymentMode = paymentMode.toUpperCase();

            if (paymentMode.equals("C")) {

                discount = bill * DISCOUNT_RATE;
                amountToPay = bill - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            }
            else if (paymentMode.equals("O")) {

                discount = 0;
                amountToPay = bill;

                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + amountToPay);

            }
            else {

                System.out.println("Payment Mode is Not Valid");

            }

            System.out.println();
        }

    }
}

