package com.biniyam.klasserobject31102022;

public class manager  extends employeee{

    String department;

    public manager(String name, String id, int salary, String department) {
        super(name, id, salary);
        this.department = department;

    }

    @Override
    public String toString() {
        return "manager{" +
                "department='" + department + '\'' +
                '}'+ super.toString();
    }
}
