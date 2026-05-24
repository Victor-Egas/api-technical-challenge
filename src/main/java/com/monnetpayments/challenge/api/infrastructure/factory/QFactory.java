package com.monnetpayments.challenge.api.infrastructure.factory;

import com.monnetpayments.challenge.api.domain.Q;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class QFactory {

    private final Map<String,Q> strategies;

    public QFactory(List<Q> implementations) {

        strategies =
                implementations.stream()
                        .collect(Collectors.toMap(
                                Q::languageType,
                                Function.identity()
                        ));
    }

    public Q getQ(String type){

        Q q = strategies.get(type);

        if(q == null){
            throw new IllegalArgumentException(
                    "No existe implementación: "
                            + type
            );
        }

        return q;
    }
}
