package com.designpatterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public List<String> operations = new ArrayList<>();

    void prepare() {
        operations.add("prepare");
    }

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
