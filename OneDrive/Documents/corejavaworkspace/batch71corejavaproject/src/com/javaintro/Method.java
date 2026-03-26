package com.javaintro;
public class Method {


    static void staticMethod1() {
        System.out.println("Inside Static Method 1");
        staticMethod2(); 
    }

 
    static void staticMethod2() {
        System.out.println("Inside Static Method 2");
        Method d = new Method();   
        d.instanceMethod1();   
    }


    void instanceMethod1() {
        System.out.println("Inside Instance Method 1");
        instanceMethod2();
    }

 
    void instanceMethod2() {
        System.out.println("Inside Instance Method 2");
    }

    public static void main(String[] args) {
        staticMethod1(); 
    }
}