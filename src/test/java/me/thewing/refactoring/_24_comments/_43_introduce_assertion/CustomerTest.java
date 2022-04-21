package me.thewing.refactoring._24_comments._43_introduce_assertion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

  @Test
  void setDiscountRate() {
    Customer customer = new Customer();
    customer.setDiscountRate(-10d);

  }

}