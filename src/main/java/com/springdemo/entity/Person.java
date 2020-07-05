package com.springdemo.entity;

import java.sql.Timestamp;

public class Person {
    private String personId;
    private String personName;
    private String location;
    private Timestamp birthDate;

    public Person() {

    }
    public Person(String personId, String personName, String location, Timestamp birthDate) {
        this.personId = personId;
        this.personName = personName;
        this.location = location;
        this.birthDate = birthDate;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }
}
