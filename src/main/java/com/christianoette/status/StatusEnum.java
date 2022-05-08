package com.christianoette.status;

public enum StatusEnum {
    ERROR(Color.RED),
    //PROCESSING(),
    SUCCESS(Color.GREEN);

    private final Color color;

    StatusEnum(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
}
