package com.designpatterns.abstractfactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new Dough("NY Dough");
    }

    public Sauce createSauce() {
        return new Sauce("NY Sauce");
    }
}
