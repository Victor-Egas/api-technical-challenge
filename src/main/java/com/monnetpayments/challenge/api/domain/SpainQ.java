package com.monnetpayments.challenge.api.domain;


import com.monnetpayments.challenge.api.shared.constants.GreetConstants;

public class SpainQ implements Q {

    @Override
    public String languageType() {
        return GreetConstants.SPAIN;
    }

    @Override
    public String greet() {
        return "hola!!!!";
    }

}
