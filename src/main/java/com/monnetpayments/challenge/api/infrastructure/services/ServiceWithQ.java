package com.monnetpayments.challenge.api.infrastructure.services;

import com.monnetpayments.challenge.api.application.services.Service;
import com.monnetpayments.challenge.api.domain.Q;
import com.monnetpayments.challenge.api.domain.UppercaseQ;
import com.monnetpayments.challenge.api.infrastructure.factory.QFactory;

@org.springframework.stereotype.Service
public class ServiceWithQ implements Service {

    private final QFactory factory;

    public ServiceWithQ(QFactory factory) {
        this.factory = factory;
    }

    @Override
    public String doAGreet( String language,
                            boolean uppercase) {
        Q q = factory.getQ(language);

        if (uppercase) {
            q = new UppercaseQ(q);
        }

        return q.greet();
    }
}
