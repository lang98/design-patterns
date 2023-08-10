package com.designpatterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    public List<String> operations = new ArrayList<>();
    Dough dough;
    Sauce sauce;

    abstract void prepare();

    void bake() {
        operations.add("bake");
    }

    void cut() {
        operations.add("cut");
    }

    void box() {
        operations.add("box");
    }
}
