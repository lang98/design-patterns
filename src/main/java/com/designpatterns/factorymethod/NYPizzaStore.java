package com.designpatterns.factorymethod;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            default -> null;
        };
    }
}
