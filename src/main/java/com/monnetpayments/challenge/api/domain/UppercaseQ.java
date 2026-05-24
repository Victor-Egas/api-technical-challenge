package com.monnetpayments.challenge.api.domain;


public class UppercaseQ implements Q {

    private final Q q;

    public UppercaseQ(Q q) {
        this.q = q;
    }

    @Override
    public String languageType() {
        return q.languageType();
    }

    @Override
    public String greet() {
        return q.greet().toUpperCase();
    }
}
