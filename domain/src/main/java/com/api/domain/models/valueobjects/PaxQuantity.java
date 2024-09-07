package com.api.domain.models.valueobjects;

public record PaxQuantity(int quantity) {
    public PaxQuantity {
        if (quantity<=0){
            throw new IllegalArgumentException("Quantity of client must be higher than 0");
        }
    }
}
