package com.fanjavaid.strategy_pattern.java.example01;

import com.fanjavaid.strategy_pattern.java.example01.payments.VAPayment;

public class PaymentClient {
    public static void main(String[] args) {
        Payment payment = new VAPayment();
        payment.topup(1000L);
        payment.pay();
    }
}