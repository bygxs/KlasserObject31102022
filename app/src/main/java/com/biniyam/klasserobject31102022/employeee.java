package com.biniyam.klasserobject31102022;

public class employeee {

   String name;
   String id;
   int salary;

   public employeee(String name, String id, int salary) {
      this.name = name;
      this.id = id;
      this.salary = salary;

   }

   @Override
   public String toString() {
      return "employeee{" +
              "name='" + name + '\'' +
              ", id='" + id + '\'' +
              ", salary=" + salary +
              '}';
   }
}
