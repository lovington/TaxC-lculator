package MusaPackage12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // tax calculator

        try {
            System.out.println("Please enter your Pay amount in Rands");
            Scanner input = new Scanner(System.in);
            double income = input.nextDouble();

            double rates;
            double netpay;

            if (income > 1 && income <= 226000) {

                rates = income * 0.18;
                netpay=income-rates;
                System.out.println("**********TAX AND NETPAY**************");
                System.out.println("Your taxable income is " + rates);
                System.out.println("Your net pay is R "+ netpay);
                System.out.println("*************END*********************");

            } else if (income >= 226001 && income <= 353100) {
                rates = 40680 + 0.26 * income;
                netpay=income-rates;
                System.out.println("**********TAX AND NETPAY**************");
                System.out.println("Your taxable income is " + rates);
                System.out.println("Your net pay is R "+ netpay);
                System.out.println("*************END*********************");
            } else if (income >= 353101 && income <= 488700) {
                rates = 73726 + 0.31 * income;
                netpay=income-rates;
                System.out.println("**********TAX AND NETPAY**************");
                System.out.println("Your taxable income is " + rates);
                System.out.println("Your net pay is R "+ netpay);
                System.out.println("*************END*********************");
            } else if (income >= 488701 && income <= 641400) {
                rates = 115762 + 0.36 * income;
                netpay=income-rates;
                System.out.println("**********TAX AND NETPAY**************");
                System.out.println("Your taxable income is " + rates);
                System.out.println("Your net pay is R "+ netpay);
                System.out.println("*************END*********************");
            } else if (income >= 641401 && income <= 817600) {
                rates = 170734 + 0.39 * income;
                netpay=income-rates;
                System.out.println("**********TAX AND NETPAY**************");
                System.out.println("Your taxable income is " + rates);
                System.out.println("Your net pay is R "+ netpay);
                System.out.println("*************END*********************");
            } else if (income >= 817601 && income <= 1731600) {
                rates = 239452 + 0.41 * income;
                netpay=income-rates;
                System.out.println("**********TAX AND NETPAY**************");
                System.out.println("Your taxable income is " + rates);
                System.out.println("Your net pay is R "+ netpay);
                System.out.println("*************END*********************");
            } else if (income >= 1731601) {
                rates = 614192 + 0.45 * income;
                netpay=income-rates;
                System.out.println("**********TAX AND NETPAY**************");
                System.out.println("Your taxable income is " + rates);
                System.out.println("Your net pay is R "+ netpay);
                System.out.println("*************END*********************");

            } else {
                System.out.println("Enter a valid income");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid numerical value.");

        }
    }
}
