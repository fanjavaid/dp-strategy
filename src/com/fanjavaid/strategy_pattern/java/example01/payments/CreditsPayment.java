package com.fanjavaid.strategy_pattern.java.example01.payments;

import com.fanjavaid.strategy_pattern.java.example01.Payment;

public class CreditsPayment extends Payment {
    @Override
    protected void topup(Long amount) {
        // Problem 1 : Same logic with Bukadompet, how to reuse the same logic?
        String logic = "ABCDE";
        System.out.println("Topup Credits " + amount + " with logic " + logic);
    }

    @Override
    protected void pay() {
        System.out.println("Pay with Credits");
    }
}
