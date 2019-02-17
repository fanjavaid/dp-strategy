package com.fanjavaid.strategy_pattern.java.example01.payments;

import com.fanjavaid.strategy_pattern.java.example01.Payment;

public class BukadompetPayment extends Payment {
    @Override
    protected void topup(Long amount) {
        String logic = "ABCDE";
        System.out.println("Topup Bukadompet " + amount + " with logic " + logic);
    }

    @Override
    protected void pay() {
        System.out.println("Pay with Bukadompet");
    }
}
