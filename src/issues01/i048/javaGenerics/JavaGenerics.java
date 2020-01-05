package issues01.i048.javaGenerics;

import java.lang.reflect.Method;

public class JavaGenerics {

    public static void main(String[] args) {

        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray( intArray );
        myPrinter.printArray( stringArray );
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals( "printArray" ))
                count++;
        }

        if (count > 1) System.out.println( "Method overloading is not allowed!" );

    }

}

class Printer <E> {
    //Write your code here
    public <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

}

/*
https://www.hackerrank.com/challenges/java-generics/problem
 */
