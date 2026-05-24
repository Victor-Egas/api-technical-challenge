package com.monnetpayments.challenge.api.domain;

import com.monnetpayments.challenge.api.shared.constants.GreetConstants;

public class EnglishQ implements Q {

    @Override
    public String languageType() {
        return GreetConstants.ENGLISH;
    }

    @Override
    public String greet() {
        return "hi!!!!";
    }
}
