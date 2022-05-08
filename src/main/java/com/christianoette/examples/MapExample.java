package com.christianoette.examples;

import com.christianoette.status.StatusEnum;

import java.util.Map;
import java.util.function.Consumer;

@SuppressWarnings("SameParameterValue")
public class MapExample {

    Map<StatusEnum, Consumer<StatusEnum>> strategies =Map.of(
            StatusEnum.ERROR, this::sendEMail,
            StatusEnum.SUCCESS, this::process
    );

    public void useEnum(StatusEnum status) {
        strategies.get(status).accept(status);
    }

    private void sendEMail(StatusEnum status) {
        System.out.println("Send E-Mail. Show status in color "+status.getColor());
    }

    private void process(StatusEnum status) {
        System.out.println("Process and show status in color"+status.getColor());
    }
}
