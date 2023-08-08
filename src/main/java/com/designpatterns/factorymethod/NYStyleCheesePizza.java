package com.designpatterns.factorymethod;

public class NYStyleCheesePizza extends Pizza {
    private static final String TYPE = "NYCheese";
    void prepare() {
        operations.add("prepare " + TYPE);
    }

    void bake() {
        operations.add("bake " + TYPE);
    }

    void cut() {
        operations.add("cut " + TYPE);
    }

    void box() {
        operations.add("box " + TYPE);
    }
}
