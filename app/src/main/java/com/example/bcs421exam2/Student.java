package com.example.bcs421exam2;

public class Student {
    private String first;
    private String last;
    private String major;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }


    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    public Student(String first, String last, String major){
        this.first = first;
        this.last = last;
        this.major = major;
    }
}
