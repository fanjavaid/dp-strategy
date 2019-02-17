package com.fanjavaid.strategy_pattern.java.example01.payments;

import com.fanjavaid.strategy_pattern.java.example01.Payment;

public class DanaPayment extends Payment {
    @Override
    protected void topup(Long amount) {
        System.out.println("Topup Dana " + amount);
    }

    @Override
    protected void pay() {
        System.out.println("Pay with Dana");
    }
}
