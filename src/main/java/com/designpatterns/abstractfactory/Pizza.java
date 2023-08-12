package com.designpatterns.abstractfactory;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Pizza {
    List<String> operations = new ArrayList<>();
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
