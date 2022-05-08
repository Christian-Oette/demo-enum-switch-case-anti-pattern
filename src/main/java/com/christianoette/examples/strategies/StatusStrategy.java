package com.christianoette.examples.strategies;

import com.christianoette.status.StatusEnumWithStrategy;

public interface StatusStrategy {
    void handle(StatusEnumWithStrategy status);
}
