package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ristorante/reservations")
public class ReservationController {

    @PostMapping
    public ResponseEntity<String> makeReservation(@RequestBody String test){
        return new ResponseEntity<>("Reservation created", HttpStatus.CREATED);
    }
}
