package com.designpatterns.abstractfactory;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();
}
