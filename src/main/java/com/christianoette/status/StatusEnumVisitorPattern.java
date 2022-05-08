package com.christianoette.status;

import com.christianoette.examples.visitor.Visitor;

public enum StatusEnumVisitorPattern {
    ERROR {
        @Override
        public void handle(Visitor visitor) {
            visitor.handleError();
        }
    },
    SUCCESS {
        @Override
        public void handle(Visitor visitor) {
            visitor.handleSuccess();
        }
    };
    public abstract void handle(Visitor visitor);
}
