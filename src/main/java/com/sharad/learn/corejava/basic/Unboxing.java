package com.sharad.learn.corejava.basic;

public class Unboxing {
	public static void main(String args[])
    {
        //  byte data type
        byte a = 1;
 
        // wrapping around Byte object
        Byte obj1 = new Byte(a);
 
        // int data type
        int b = 10;
 
        //wrapping around Integer object
        Integer obj2 = new Integer(b);
 
        // float data type
        float c = 18.6f;
 
        // wrapping around Float object
        Float obj3 = new Float(c);
 
        // double data type
        double d = 250.5;
 
        // Wrapping around Double object
        Double obj4 = new Double(d);
 
        // char data type
        char e='a';
 
        // wrapping around Character object
        Character obj5=e;
 
        //  printing the values from objects
        System.out.println("Values of Wrapper objects (printing as objects)");
        System.out.println("Byte object byteobj:  " + obj1);
        System.out.println("Integer object intobj:  " + obj2);
        System.out.println("Float object floatobj:  " + obj3);
        System.out.println("Double object doubleobj:  " + obj4);
        System.out.println("Character object charobj:  " + obj5);
 
        // objects to data types (retrieving data types from objects)
        // unwrapping objects to primitive data types
        byte bx = obj1;
        int ix = obj2;
        float fx = obj3;
        double dx = obj4;
        char cx = obj5;
 
        // printing the values from data types
        System.out.println("Unwrapped values (printing as data types)");
        System.out.println("byte value, bx: " + bx);
        System.out.println("int value, ix: " + ix);
        System.out.println("float value, fx: " + fx);
        System.out.println("double value, dx: " + dx);
        System.out.println("char value, cx: " + cx);
    }
}



