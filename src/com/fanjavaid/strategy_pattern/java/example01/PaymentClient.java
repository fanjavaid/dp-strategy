package com.fanjavaid.strategy_pattern.java.example01;

import com.fanjavaid.strategy_pattern.java.example01.payments.WalletPay;
import com.fanjavaid.strategy_pattern.java.example01.payments.behavior.IPayBehavior;

public class PaymentClient {
    public static void main(String[] args) {
        IPayBehavior walletBehavior = new WalletPay();
        Payment payment = new Payment(walletBehavior);
        payment.pay();
    }
}