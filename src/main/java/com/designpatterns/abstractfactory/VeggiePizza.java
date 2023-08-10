package com.designpatterns.abstractfactory;

public class VeggiePizza extends Pizza {
    private static final String TYPE = "NYVeggie";
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
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
