package com.teachmeskills.hw7.task1.main;

import com.teachmeskills.hw7.task1.creditcard.CreditCard;
import com.teachmeskills.hw7.task1.operations.Operations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();
        System.out.println("Enter the amount to add: ");
        double addAmount = scanner.nextDouble();
        System.out.println("Enter the amount to withdraw: ");
        double withDrawAmount = scanner.nextDouble();
        CreditCard cc1 = new CreditCard("IBAN135121212", 1000.46);
        CreditCard cc2 = new CreditCard("IBAN189999543", 999.38);
        CreditCard cc3 = new CreditCard("IBAN135630300", 867.45);
        operations.addAmountToCreditCard(cc1, addAmount);
        operations.addAmountToCreditCard(cc2, addAmount);
        operations.withdrawAmountToCreditCard(cc3, withDrawAmount);
        operations.informationOutput(cc1);
        operations.informationOutput(cc2);
        operations.informationOutput(cc3);
        scanner.close();
    }
}
