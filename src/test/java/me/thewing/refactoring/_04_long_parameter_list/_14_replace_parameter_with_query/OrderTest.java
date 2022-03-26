package me.thewing.refactoring._04_long_parameter_list._14_replace_parameter_with_query;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    void discountedPriceWithDiscountLevel2() {
        int quantity = 200;
        double price = 100;
        assertEquals(quantity * price * 0.90, new Order(quantity, price).finalPrice());
    }

    @Test
    void discountedPriceWithDiscountLevel1() {
        int quantity = 100;
        double price = 100;
        assertEquals(quantity * price * 0.95, new Order(quantity, price).finalPrice());
    }

}