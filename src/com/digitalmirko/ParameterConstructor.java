package com.digitalmirko;

// Java Constructor with Parameters Example

public class ParameterConstructor {

    private String name;

    public ParameterConstructor(String str) {
        this.name = str;
        System.out.println("Inside the parameter constructor");
        System.out.println("The argument value is: " + str);
    }

    public static void main(String[] args) {
        ParameterConstructor pc = new ParameterConstructor("Mirko Cukich");
    }
}

/*
Output:
Inside the parameter constructor
The argument value is: Mirko Cukich
 */