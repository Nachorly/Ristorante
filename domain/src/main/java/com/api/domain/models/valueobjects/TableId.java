package com.api.domain.models.valueobjects;

public record TableId(String id) {
    public TableId {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("TableId cannot be empty");
        }
    }
}
