package com.fanjavaid.strategy_pattern.java.example01.payments;

import com.fanjavaid.strategy_pattern.java.example01.payments.behavior.ITopupBehavior;

public class DanaTopup implements ITopupBehavior {
    @Override
    public void topup(Long amount) {
        System.out.printf("Redirect to DANA Screen and Confirm topup");
    }
}
