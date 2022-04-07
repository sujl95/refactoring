package me.thewing.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void employeeType() {
        assertEquals("engineer", Employee.createEmployee("sungjun", "engineer").getType());
        assertEquals("manager", Employee.createEmployee("sungjun", "manager").getType());
        assertThrows(IllegalArgumentException.class, () -> Employee.createEmployee("sungjun", "wrong type"));
    }

}