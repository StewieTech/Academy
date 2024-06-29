package com.bptn.course.week3.Intel.test;

import java.util.ArrayList;

public class MyClass {

    private int number;
    private String text;
    private boolean flag;

    // Constructor with three parameters
    public MyClass(int number, String text, boolean flag) {
        this.number = number;
        this.text = text;
        this.flag = flag;
    }

    // Getter methods
    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public boolean isFlag() {
        return flag;
    }

    // Setter methods
    public void setNumber(int number) {
        this.number = number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    // Other methods
    public void printDetails() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
        System.out.println("Flag: " + flag);
    }

    public boolean isNumberGreaterThan(int value) {
        return number > value;
    }

    public String concatenateText(String otherText) {
        return text + otherText;
    }
}
