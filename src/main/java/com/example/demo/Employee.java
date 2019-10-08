package com.example.demo;

//@Entity
public class Employee<date> {
    private String firstname;
    private String lastname;
    private long ssn;
    private date dob;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public date getDob() {
        return dob;
    }

    public void setDob(date dob) {
        this.dob = dob;
    }
}

