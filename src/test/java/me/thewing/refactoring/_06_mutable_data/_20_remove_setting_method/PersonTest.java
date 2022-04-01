package me.thewing.refactoring._06_mutable_data._20_remove_setting_method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void person() {
        Person person = new Person(10);
        person.setName("sungjun");
        assertEquals(10, person.getId());
        assertEquals("sungjun", person.getName());
        person.setName("thewing");
        assertEquals("thewing", person.getName());
    }

}