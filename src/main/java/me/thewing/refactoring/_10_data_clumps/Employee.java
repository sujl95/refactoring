package me.thewing.refactoring._10_data_clumps;

public class Employee {

    private String name;
    private TelephoneNumber employeeTelephoneNumber;

    public Employee(String name, TelephoneNumber employeeTelephoneNumber) {
        this.name = name;
        this.employeeTelephoneNumber = employeeTelephoneNumber;
    }

    public String personalPhoneNumber() {
        return employeeTelephoneNumber.getAreaCode() + "-" + employeeTelephoneNumber.getNumber();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalAreaCode() {
        return employeeTelephoneNumber.getAreaCode();
    }

    public void setPersonalAreaCode(String personalAreaCode) {
        employeeTelephoneNumber.setAreaCode(personalAreaCode);
    }

    public String getPersonalNumber() {
        return employeeTelephoneNumber.getNumber();
    }

    public void setPersonalNumber(String personalNumber) {
        employeeTelephoneNumber.setNumber(personalNumber);
    }
}
