package com.api.domain.models.valueobjects;

import java.time.LocalDateTime;

public record ReservationDate(LocalDateTime dateTime) {
    public ReservationDate {
        if (dateTime == null) {
            throw new IllegalArgumentException("DateTime can not be null");
        }
        if (dateTime.isBefore(LocalDateTime.now())){
            throw new IllegalArgumentException("DateTime must be before actual DateTime");
        }
    }
}
