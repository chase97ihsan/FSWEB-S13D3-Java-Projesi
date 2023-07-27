package com.workintech.examples;

public class Person {
    String firstname;
    String  lastname;
    int age;
    Double salary;
    boolean ismarried;
    String[] pets;

    public Person(String firstname, String lastname, int age){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }
    public Person(String firstname, String lastname, int age,Double salary,boolean ismarried, String[] pets){
        this(firstname,lastname,age);
        this.salary=salary;
        this.ismarried=ismarried;
        this.pets=pets;
    }

    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(int age){
    return age>13&&age<19;
    }


}
