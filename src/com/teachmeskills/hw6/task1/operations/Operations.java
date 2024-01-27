package com.teachmeskills.hw6.task1.operations;

import com.teachmeskills.hw6.task1.creditcard.CreditCard;

public class Operations {
    public double addAmountToCreditCard(CreditCard creditCard, double addAmount) {
        creditCard.amountOnAccount = creditCard.amountOnAccount + addAmount;
        return creditCard.amountOnAccount;
    }

    public double withdrawAmountToCreditCard(CreditCard creditCard, double withDrawAmount) {
        creditCard.amountOnAccount = creditCard.amountOnAccount - withDrawAmount;
        return creditCard.amountOnAccount;
    }

    public void informationOutput(CreditCard creditCard) {
        System.out.println("The amount on the credit card is: " + creditCard.amountOnAccount);
        System.out.println("The bank account number is: " + creditCard.bankAccountNumber);
        System.out.println();
    }
}
