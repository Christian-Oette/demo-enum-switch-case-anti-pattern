package com.christianoette.examples;

import com.christianoette.examples.visitor.Visitor;
import com.christianoette.status.StatusEnumVisitorPattern;

public class VisitorExample implements Visitor {

    public void useEnum(StatusEnumVisitorPattern status) {
        status.handle(this);
    }

    @Override
    public void handleError() {
        System.out.println("Handle error");
    }

    @Override
    public void handleSuccess() {
        System.out.println("Handle success");
    }
}
