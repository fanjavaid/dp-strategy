package com.fanjavaid.strategy_pattern.java.example01.payments;

import com.fanjavaid.strategy_pattern.java.example01.Payment;

public class VAPayment extends Payment {
    @Override
    protected void topup(Long amount) {
        // Problem 2 : VA emang butuh topup?
        // ...
    }

    @Override
    protected void pay() {
        System.out.println("Pay with Virtual Account");
    }
}
