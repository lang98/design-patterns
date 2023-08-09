package com.designpatterns.factorymethod;

public class NYStyleVeggiePizza extends Pizza {
    private static final String TYPE = "NYVeggie";
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
