package com.christianoette.examples;

import com.christianoette.status.Color;
import com.christianoette.status.StatusEnumNotRefactoringSafe;

@SuppressWarnings("SameParameterValue")
public class AntipatternExample {

    public void useEnum(StatusEnumNotRefactoringSafe status) {
        switch(status) {
            case SUCCESS -> showSuccess(Color.GREEN);
            case ERROR -> sendEMailAndShowError(Color.RED);
            default -> throw new IllegalStateException("Not implemented yet. Unknown state "+status);
        }
    }

    private void sendEMailAndShowError(Color color) {
        System.out.println("Send E-Mail and show error in color "+color);
    }

    private void showSuccess(Color color) {
        System.out.println("Show success in color "+color);
    }
}
