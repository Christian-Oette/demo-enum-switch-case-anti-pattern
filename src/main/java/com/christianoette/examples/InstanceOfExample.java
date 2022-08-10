package com.christianoette.examples;

public class InstanceOfExample {





    static abstract sealed class Shape permits Circle, Rectangle/*, Triangle*/ {

    }

    static final class Circle extends Shape {

    }

    static final class Rectangle extends Shape {

    }

//    static final class Triangle extends Shape {
//
//    }


}
