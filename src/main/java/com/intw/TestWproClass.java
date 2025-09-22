package com.intw;


public class TestWproClass {

    public static void main(String[] args) {
        TestWproClass.someMethod(null);

//    Null and Specificity: When null is passed, the compiler looks for the most specific method that can accept
//    null. In this case, both Object and String can accept null, but String is the more specific type in the method signatures available.
//    Therefore, the compiler chooses the someMethod(String s) method because String is a more specific type
//    than Object, even though null could technically be assigned to an Object.

    }

    public static void someMethod(Object o)
    {
        System.out.println("Print null");
    }


    public static void someMethod(String s)
    {
        System.out.println("Print "+s);
    }


}
