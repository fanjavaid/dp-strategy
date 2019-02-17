package com.fanjavaid.strategy_pattern.java.example01;

public abstract class Payment {
    protected abstract void topup(Long amount);
    protected abstract void pay();
}
