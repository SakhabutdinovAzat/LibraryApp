package ru.app.library.model;

import javax.validation.constraints.*;

public class Person {

    private int id;

    @NotEmpty(message = "FullName is not be empty")
    @Size(min = 2, max = 100, message = "Size should be between 2 and 100 characters")
    @Pattern( regexp = "[A-Z]\\w+ [A-Z]\\w+ [A-Z]\\w+", message= "Incorrect full name")
    private String fullName;

    @Min(value = 0, message = "Age should be more than 0")
    private int age;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Invalid email")
    private String email;

    @Pattern( regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}", message= "Incorrect address")
    private String address;

    public Person(){
    }

    public Person(int id, String fullName, int age, String email, String address) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.address= address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
