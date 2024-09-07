package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.ReservationService;
import service.ReservationServiceImpl;

@Configuration
public class DomainConfiguration {

    @Bean
    public ReservationService reservationService(){
        return new ReservationServiceImpl();
    }
}
