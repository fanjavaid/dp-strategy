package com.fanjavaid.strategy_pattern.java.example01.payments;

import com.fanjavaid.strategy_pattern.java.example01.payments.behavior.IPayBehavior;

public class WalletPay implements IPayBehavior {
    @Override
    public void pay() {
        System.out.println("Pay with Bukadompet/Credits");
    }
}
