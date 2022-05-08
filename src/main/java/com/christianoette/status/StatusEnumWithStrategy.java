package com.christianoette.status;

import com.christianoette.examples.strategies.ErrorStrategy;
import com.christianoette.examples.strategies.StatusStrategy;
import com.christianoette.examples.strategies.SuccessStrategy;

public enum StatusEnumWithStrategy {
    ERROR(Color.RED, ErrorStrategy.class),
    // PROCESSING(),
    SUCCESS(Color.GREEN, SuccessStrategy.class);

    private final Color color;
    private final Class<? extends StatusStrategy> statusStrategy;

    StatusEnumWithStrategy(Color color, Class<? extends StatusStrategy> strategy) {
        this.color = color;
        this.statusStrategy = strategy;
    }

    public Color getColor() {
        return color;
    }

    public Class<? extends StatusStrategy> getStatusStrategy() {
        return statusStrategy;
    }
}
