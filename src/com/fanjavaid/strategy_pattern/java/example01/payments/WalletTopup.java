package com.fanjavaid.strategy_pattern.java.example01.payments;

import com.fanjavaid.strategy_pattern.java.example01.payments.behavior.ITopupBehavior;

public class WalletTopup implements ITopupBehavior {
    @Override
    public void topup(Long amount) {
        String logic = "ABCDE";
        System.out.println("Topup Bukadompet/Credits " + amount + " with logic " + logic);
    }
}