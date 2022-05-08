package com.christianoette.examples;

import com.christianoette.status.StatusEnum;

import java.util.Map;
import java.util.function.Consumer;

@SuppressWarnings("SameParameterValue")
public class MapExample {

    Map<StatusEnum, Consumer<StatusEnum>> strategies =Map.of(
            StatusEnum.SUCCESS, this::showSuccess,
            StatusEnum.ERROR, this::sendEMailAndShowError
    );

    public void useEnum(StatusEnum status) {
        strategies.get(status).accept(status);
    }

    private void sendEMailAndShowError(StatusEnum status) {
        System.out.println("Send E-Mail. Show status in color "+status.getColor().name());
    }

    private void showSuccess(StatusEnum status) {
        System.out.println("Process and show status in color"+status.getColor().name());
    }
}
