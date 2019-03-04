package com.fanjavaid.strategy_pattern.java.example01.payments;

import com.fanjavaid.strategy_pattern.java.example01.payments.behavior.IPayBehavior;

public class DanaPay implements IPayBehavior {
    @Override
    public void pay() {
        System.out.println("Send Invoice ID to DANA and Confirm payment");
    }
}
