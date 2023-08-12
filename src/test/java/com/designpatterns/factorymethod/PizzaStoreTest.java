package com.designpatterns.factorymethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
    }

    @Test
    void shouldSucceed_makeNYVeggiePizzas() {
        Pizza pizza = nyPizzaStore.orderPizza("veggie");
        assertThat(pizza.operations).contains("prepare NYVeggie", "bake NYVeggie", "cut NYVeggie", "box NYVeggie");
    }
}
