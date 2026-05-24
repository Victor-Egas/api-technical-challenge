package com.monnetpayments.challenge.api.config;

import com.monnetpayments.challenge.api.domain.EnglishQ;
import com.monnetpayments.challenge.api.domain.SpainQ;
import com.monnetpayments.challenge.api.domain.Q;
import com.monnetpayments.challenge.api.domain.UppercaseQ;
import com.monnetpayments.challenge.api.shared.constants.GreetConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(GreetConstants.SPAIN_BEAN)
    Q getQ(){
        return new SpainQ();
    }

    @Bean(GreetConstants.ENGLISH_BEAN)
    Q getQ2(){
        return new EnglishQ();
    }

    Q getQ3(){
        return new UppercaseQ(new EnglishQ());
    }
}