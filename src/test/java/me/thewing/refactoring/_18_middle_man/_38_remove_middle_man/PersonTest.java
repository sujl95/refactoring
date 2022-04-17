package me.thewing.refactoring._18_middle_man._38_remove_middle_man;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void getManager() {
        Person nick = new Person("nick", null);
        Person keesun = new Person("keesun", new Department(nick));
        assertEquals(nick, keesun.getDepartment().getManager());
    }

}