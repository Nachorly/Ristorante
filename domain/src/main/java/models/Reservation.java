package models;

import models.valueobjects.*;

public class Reservation {
    private final TableId tableId;
    private final ReservationDate reservationDate;
    private final ReservationStatus reservationStatus;
    private final PaxName paxName;
    private final PaxQuantity paxQuantity;
    private final Email email;
    private final PhoneNumber phoneNumber;

    public Reservation(TableId tableId, ReservationDate reservationDate, ReservationStatus reservationStatus, PaxName paxName, PaxQuantity paxQuantity, Email email, PhoneNumber phoneNumber) {
        this.tableId = tableId;
        this.reservationDate = reservationDate;
        this.reservationStatus = reservationStatus;
        this.paxName = paxName;
        this.paxQuantity = paxQuantity;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public TableId getTableId() {
        return tableId;
    }

    public ReservationDate getReservationDate() {
        return reservationDate;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public PaxName getPaxName() {
        return paxName;
    }

    public PaxQuantity getPaxQuantity() {
        return paxQuantity;
    }

    public Email getEmail() {
        return email;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
