/* MONNET PAYMENTS: (C)2023 */
package com.monnetpayments.challenge.api;

import com.monnetpayments.challenge.api.shared.constants.GreetConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = GreetConstants.SCAN_BASES_PACKAGE)
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
