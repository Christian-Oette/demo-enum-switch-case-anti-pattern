package com.christianoette.examples;

import org.junit.jupiter.api.Test;

public class InstanceOfExampleTest {

    @Test
    public void testCaseWithoutDefault () {
        InstanceOfExample.Shape shape = new InstanceOfExample.Rectangle();
        print(shape);
    }

    /**
     * InstanceOf check with switch
     * You can remove the default case
     *
     * Try to uncomment the Triangle class in InstanceOfExample and see what happens
     */
    private void print(InstanceOfExample.Shape shape) {
        switch (shape) {
            case InstanceOfExample.Rectangle rectangle -> System.out.println("It's a rectangle ");
            case InstanceOfExample.Circle circle -> System.out.println("It's a circle ");
        }
    }

}
