package com.designpatterns.factorymethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

public class PizzaStoreTest {
    PizzaStore nyPizzaStore;

    @BeforeEach
    void setUp() {
        nyPizzaStore = new NYPizzaStore();
    }

    @Test
    void shouldSucceed_makeNYPizzas() {
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        assertThat(pizza.operations, hasItems("prepare NYCheese", "bake NYCheese", "cut NYCheese", "box NYCheese"));
    }
}
