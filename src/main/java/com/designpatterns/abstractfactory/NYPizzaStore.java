package com.designpatterns.abstractfactory;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        var ingredientFactory = new NYPizzaIngredientFactory();

        return switch (type) {
            case "cheese" -> new CheesePizza(ingredientFactory);
            case "veggie" -> new VeggiePizza(ingredientFactory);
            default -> null;
        };
    }
}
