package com.digitalmirko;

// Chaining Java Constructor Example

public class ChainingConstructors {

    public ChainingConstructors(){
        System.out.println("Default Constructor");
    }

    public ChainingConstructors(int i){
        this();
        System.out.println("Single parameter constructor");
    }

    public ChainingConstructors(String str, int i){
        this(i);
        System.out.println("Double parameter constructor");
    }

    public static void main(String[] args) {
        ChainingConstructors cc = new ChainingConstructors("Java",1);
    }
}

/*
Output:
Default Constructor
Single parameter constructor
Double parameter constructor
 */