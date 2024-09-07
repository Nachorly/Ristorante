package com.api.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.api.domain.service.ReservationService;
import com.api.domain.service.ReservationServiceImpl;

@Configuration
public class DomainConfiguration {

    @Bean
    public ReservationService reservationService(){
        return new ReservationServiceImpl();
    }
}
