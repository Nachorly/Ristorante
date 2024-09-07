package com.api.domain.models.valueobjects;

public record PaxName(String name) {
    public PaxName {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Client name can not be empty.");
        }
    }
}
