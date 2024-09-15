package com.api.boot.controllers;

import com.api.boot.dto.ReservationRequest;
import com.api.domain.models.Reservation;
import com.api.domain.models.valueobjects.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.domain.service.ReservationService;

@RestController
@RequestMapping("/ristorante/reservations")
public class ReservationController {
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public ResponseEntity<String> crearReserva(@RequestBody ReservationRequest reservaRequest) {

        return ResponseEntity.ok("PaxName" + reservaRequest.getPaxName());
    }
}
