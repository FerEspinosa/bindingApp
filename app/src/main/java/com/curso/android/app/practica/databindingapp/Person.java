package com.curso.android.app.practica.databindingapp;

public class Person {

    String name, email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
