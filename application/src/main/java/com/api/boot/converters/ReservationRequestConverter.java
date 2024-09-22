package com.api.boot.converters;

import com.api.boot.dto.ReservationRequest;
import com.api.domain.models.Reservation;
import com.api.domain.models.valueobjects.*;

public class ReservationRequestConverter {

    public static Reservation reservationRequestToDomain(ReservationRequest reservationRequest){
        TableId tableId = new TableId(reservationRequest.getTableId());
        ReservationDate reservationDate = new ReservationDate(reservationRequest.getReservationDate());
        ReservationStatus reservationStatus = ReservationStatus.PENDING;
        PaxName paxName = new PaxName(reservationRequest.getPaxName());
        PaxQuantity paxQuantity = new PaxQuantity(reservationRequest.getPaxQuantity());
        Email email = new Email(reservationRequest.getEmail());
        PhoneNumber phoneNumber = new PhoneNumber(reservationRequest.getPhone());

        return new Reservation(tableId, reservationDate, reservationStatus, paxName, paxQuantity, email, phoneNumber);
    }
}
