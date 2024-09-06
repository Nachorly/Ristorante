package models.valueobjects;

import java.util.regex.Pattern;

public record Email(String email) {
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@(.+)$"
    );

    public Email {
        if (email == null || EMAIL_PATTERN.matcher(email).matches()){
            throw new IllegalArgumentException("Client email is not valid.");
        }
    }
}
