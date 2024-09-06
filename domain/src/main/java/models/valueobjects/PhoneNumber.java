package models.valueobjects;

public record PhoneNumber(String phoneNumber) {
    public PhoneNumber {
        if (phoneNumber == null || phoneNumber.length() != 10){
            throw new IllegalArgumentException("Phone number must contain 10 digits");
        }
    }
}
