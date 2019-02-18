package com.fanjavaid.strategy_pattern.java.example01;

import com.fanjavaid.strategy_pattern.java.example01.payments.DanaPay;
import com.fanjavaid.strategy_pattern.java.example01.payments.VirtualAccountPay;
import com.fanjavaid.strategy_pattern.java.example01.payments.WalletPay;

public class PaymentClient {
    public static void main(String[] args) {
//        ITopupBehavior topupBehavior = new WalletTopup();
//        IPayBehavior payBehavior = new WalletPay();

        // wallet, dana, va
        String selectedPayment = "va";

        Payment payment = new Payment();
        switch (selectedPayment) {
            case "wallet":
                payment.setPayBehavior(new WalletPay());
                break;

            case "dana":
                payment.setPayBehavior(new DanaPay());
                break;

            case "va":
                payment.setPayBehavior(new VirtualAccountPay());
                break;
        }

//        payment.topup(1000L);
        payment.pay();
    }
}