package me.thewing.refactoring._06_mutable_data._23_change_reference_to_value;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelephoneNumberTest {

  @Test
  void testEquals() {
    TelephoneNumber number1 = new TelephoneNumber("123", "1234");
    TelephoneNumber number2 = new TelephoneNumber("123", "1234");
    assertEquals(number1, number2);
  }

}