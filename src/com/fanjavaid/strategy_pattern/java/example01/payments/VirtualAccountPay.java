package com.fanjavaid.strategy_pattern.java.example01.payments;

import com.fanjavaid.strategy_pattern.java.example01.payments.behavior.IPayBehavior;

import java.util.Random;

public class VirtualAccountPay implements IPayBehavior {
    @Override
    public void pay() {
        Random random = new Random();
        long min = 1_000_000;
        long max = 9_999_999;
        System.out.println("Generate VA Number (" + (random.nextLong() % (max - min) + max) + ") and return it");
    }
}
