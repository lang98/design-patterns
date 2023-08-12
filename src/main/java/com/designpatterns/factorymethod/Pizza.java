package com.designpatterns.factorymethod;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Pizza {
    List<String> operations = new ArrayList<>();

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
