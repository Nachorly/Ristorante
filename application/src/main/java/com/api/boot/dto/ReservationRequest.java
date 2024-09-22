package com.api.boot.dto;

import java.time.LocalDateTime;

public class ReservationRequest {
    private String tableId;
    private LocalDateTime reservationDate;
    private String paxName;
    private int paxQuantity;
    private String email;
    private String phone;

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getPaxName() {
        return paxName;
    }

    public void setPaxName(String paxName) {
        this.paxName = paxName;
    }

    public int getPaxQuantity() {
        return paxQuantity;
    }

    public void setPaxQuantity(int paxQuantity) {
        this.paxQuantity = paxQuantity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
