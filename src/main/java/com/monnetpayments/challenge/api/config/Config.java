package com.monnetpayments.challenge.api.config;

import com.monnetpayments.challenge.api.domain.EnglishQ;
import com.monnetpayments.challenge.api.domain.SpainQ;
import com.monnetpayments.challenge.api.domain.Q;
import com.monnetpayments.challenge.api.domain.UppercaseQ;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Config {

    @Bean("SpainQ")
    Q getQ(){
        return new SpainQ();
    }

    @Bean("EnglishQ")
    Q getQ2(){
        return new EnglishQ();
    }

    @Bean("UppercaseQ")
    Q getQ3(
            @Qualifier("SpainQ") Q q){
        return new UppercaseQ(new SpainQ());
    }
}