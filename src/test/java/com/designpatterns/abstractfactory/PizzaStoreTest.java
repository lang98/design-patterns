package com.designpatterns.abstractfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
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
        assertThat(pizza.operations, hasItems("prepare NYCheese", "bake NYCheese", "cut NYCheese", "box NYCheese"));
        assertEquals("NY Dough", pizza.dough.getName());
        assertEquals("NY Sauce", pizza.sauce.getName());
    }
}
