package com.christianoette.examples;

import com.christianoette.status.StatusEnumWithStrategy;
import com.christianoette.examples.strategies.StatusStrategy;

@SuppressWarnings("SameParameterValue")
public class StrategyExample {

    public void useEnum(StatusEnumWithStrategy status) {
        Class<? extends StatusStrategy> strategy = status.getStatusStrategy();
        System.out.println("Load bean of strategy "+strategy+" from application context and execute. Show status in color "+status.getColor());
    }

}
