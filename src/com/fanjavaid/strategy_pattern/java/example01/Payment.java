package com.fanjavaid.strategy_pattern.java.example01;

import com.fanjavaid.strategy_pattern.java.example01.payments.VirtualAccountPay;
import com.fanjavaid.strategy_pattern.java.example01.payments.behavior.IPayBehavior;
import com.fanjavaid.strategy_pattern.java.example01.payments.behavior.ITopupBehavior;

public class Payment {
    private ITopupBehavior topupBehavior;
    private IPayBehavior payBehavior;

    public Payment() {
    }

    public Payment(IPayBehavior payBehavior) {
        this.payBehavior = payBehavior;
    }

    public Payment(ITopupBehavior topupBehavior, IPayBehavior payBehavior) {
        this.topupBehavior = topupBehavior;
        this.payBehavior = payBehavior;
    }

    public void setTopupBehavior(ITopupBehavior topupBehavior) {
        this.topupBehavior = topupBehavior;
    }

    public void setPayBehavior(IPayBehavior payBehavior) {
        this.payBehavior = payBehavior;
    }

    protected void topup(Long amount) {
        if (topupBehavior != null) {
            if (!(payBehavior instanceof VirtualAccountPay)) {
                topupBehavior.topup(amount);
            } else System.err.println("Topup just supported for non Virtual Account Payment");
        }
    }

    protected void pay() {
        payBehavior.pay();
    }
}