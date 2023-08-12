package com.designpatterns.abstractfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaStoreTest {
    PizzaStore nyPizzaStore;

    @BeforeEach
    void setUp() {
        nyPizzaStore = new NYPizzaStore();
    }

    @Test
    void shouldSucceed_makeNYCheesePizzas() {
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        assertThat(pizza.operations).contains("prepare NYCheese", "bake NYCheese", "cut NYCheese", "box NYCheese");
        assertEquals("NY Dough", pizza.dough.getName());
        assertEquals("NY Sauce", pizza.sauce.getName());
    }
}
