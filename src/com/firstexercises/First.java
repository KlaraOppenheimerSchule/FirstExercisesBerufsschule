package com.firstexercises;

import java.util.Scanner;

public class First {
    private static final float PRICE_SUPER_E5 = 1.189F;
    private static final float PRICE_SUPER_E10 = 1.139F;
    private static final float PRICE_DIESEL = 0.989F;
    private static final float PERCENT_SALE = 0.95F;
    private static final byte LITER_BEFORE_SALE = 100;

    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        double priceToPay = 0;
        int operationNumber = 0;
        double literAmount = 0;

        try {
            System.out.print("Do you want to pay for Diezel(1), Super E5(2) or Super E10 (3): ");
            operationNumber = scanner.nextInt();

            System.out.print("How much liter: ");
            literAmount = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.exit(0);
        }

        if (operationNumber == 1) {
            priceToPay = literAmount * PRICE_DIESEL;
        } else if (operationNumber == 2) {
            priceToPay = literAmount * PRICE_SUPER_E5;
        } else if (operationNumber == 3) {
            priceToPay = literAmount * PRICE_SUPER_E10;
        } else {
            System.out.println("This number of liquid doesn't exist!");
            System.exit(0);
        }

        if (literAmount >= LITER_BEFORE_SALE) {
            priceToPay *= PERCENT_SALE;
        }

        System.out.println("You have to pay: " + (float)priceToPay + "€");
    }
}
