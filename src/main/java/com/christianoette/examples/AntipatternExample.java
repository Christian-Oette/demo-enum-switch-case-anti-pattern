package com.christianoette.examples;

import com.christianoette.status.StatusEnumNotRefactoringSafe;

public class AntipatternExample {

    public void useEnum(StatusEnumNotRefactoringSafe status) {
        switch(status) {
            case SUCCESS -> process();
            case ERROR -> sendEMail();
            default -> throw new IllegalStateException("Not implemented yet. Unknown state "+status);
        }
    }

    private void sendEMail() {
        System.out.println("Send E-Mail");
    }

    private void process() {
        System.out.println("Process");
    }
}
