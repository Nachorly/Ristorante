package models.valueobjects;

public record TableId(String id) {
    public TableId {
        if (id() == null || id().isEmpty()){
            throw new IllegalArgumentException("TableId can not be empty");
        }
    }
}
