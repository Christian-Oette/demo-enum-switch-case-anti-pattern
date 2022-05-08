package com.christianoette.status;

public enum StatusEnum {
    ERROR("red"),
    // PROCESSING(),
    SUCCESS("green");

    private final String color;

    StatusEnum(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
