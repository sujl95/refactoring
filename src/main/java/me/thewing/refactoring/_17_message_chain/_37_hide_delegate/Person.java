package me.thewing.refactoring._17_message_chain._37_hide_delegate;

public class Person {

    private String name;

    private Department department;

    private Person mananger;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getManager() {
        this.mananger = getDepartment().getManager();
        return mananger;
    }
}
