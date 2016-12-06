package com.digitalmirko;

// Overloading Java Constructor Example

public class OverloadingConstructors {

    public OverloadingConstructors(){
        System.out.println("Default Constructor");
    }

    public OverloadingConstructors(int i){
        System.out.println("Single parameter constructor with int: " + i + " value");
    }

    public OverloadingConstructors(String str){
        System.out.println("Single parameter constructor with String: " + str + " value");
    }

    public OverloadingConstructors(String str1, String str2, int i){
        System.out.println("Multiple parameter constructor with String: " + str1 + " and String: " + str2 + " and int: " + i);
    }

    public static void main(String[] args) {
        OverloadingConstructors olc = new OverloadingConstructors();
        OverloadingConstructors solc = new OverloadingConstructors(100);
        OverloadingConstructors strolc = new OverloadingConstructors("Java Rocks");
        OverloadingConstructors molc = new OverloadingConstructors("Android", "Java", 1);
    }
}

/*
Output:
Default Constructor
Single parameter constructor with int: 100 value
Single parameter constructor with String: Java Rocks value
Multiple parameter constructor with String: Android and String: Java and int: 1
 */
