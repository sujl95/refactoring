package me.thewing.refactoring._23_refused_bequest;

public class Employee {

    protected Quota quota;

    protected Quota getQuota() {
        return new Quota();
    }

}
