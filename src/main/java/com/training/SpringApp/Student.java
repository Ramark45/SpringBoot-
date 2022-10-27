package com.training.SpringApp;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getlastName()
    {
        return lastName;
    }
    public void setlastName(String lastName)
    {
        this.lastName=lastName;
    }
}
