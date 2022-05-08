package com.christianoette.status;

import com.christianoette.examples.strategies.ErrorStrategy;
import com.christianoette.examples.strategies.StatusStrategy;
import com.christianoette.examples.strategies.SuccessStrategy;

public enum StatusEnumWithStrategy {
    ERROR("red", ErrorStrategy.class),
    // PROCESSING(),
    SUCCESS("green", SuccessStrategy.class);

    private final String color;
    private final Class<? extends StatusStrategy> statusStrategy;

    StatusEnumWithStrategy(String color, Class<? extends StatusStrategy> strategy) {
        this.color = color;
        this.statusStrategy = strategy;
    }

    public String getColor() {
        return color;
    }

    public Class<? extends StatusStrategy> getStatusStrategy() {
        return statusStrategy;
    }
}
